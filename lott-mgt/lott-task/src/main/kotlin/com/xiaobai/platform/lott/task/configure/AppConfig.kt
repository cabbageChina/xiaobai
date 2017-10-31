package com.xiaobai.platform.lott.task.configure

import org.slf4j.LoggerFactory
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.AsyncConfigurer
import org.springframework.scheduling.annotation.SchedulingConfigurer
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler
import org.springframework.scheduling.config.ScheduledTaskRegistrar
import java.util.concurrent.Executor

/**
 *
 *  @author  : xiaobai
 */
@Configuration
class AppConfig: SchedulingConfigurer, AsyncConfigurer {

    private val log = LoggerFactory.getLogger(this::class.java)

    @Bean
    fun schedulerExecutor(): Executor {
        val scheduler = ThreadPoolTaskScheduler()
        scheduler.setThreadGroupName("spring-task-scheduler-")
        scheduler.poolSize = 10
        return scheduler
    }


    override fun getAsyncExecutor(): Executor {
        val executor = ThreadPoolTaskExecutor()
        executor.corePoolSize = 10
        executor.maxPoolSize = 50
        executor.setQueueCapacity(20)
        executor.threadNamePrefix = "spring-async-task-"
        executor.initialize()
        return executor
    }


    override fun getAsyncUncaughtExceptionHandler(): AsyncUncaughtExceptionHandler {
        return AsyncUncaughtExceptionHandler {
            ex, method, params ->
            run {
                log.error("task executor error", ex)
            }
        }
    }

    override fun configureTasks(taskRegistrar: ScheduledTaskRegistrar?) {
        taskRegistrar?.setScheduler(schedulerExecutor())
    }

}