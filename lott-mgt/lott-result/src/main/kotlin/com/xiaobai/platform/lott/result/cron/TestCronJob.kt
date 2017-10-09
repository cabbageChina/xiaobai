package com.xiaobai.platform.lott.result.cron

import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime

/**
 *
 *  @author  : xiaobai
 */
@Component
@EnableScheduling
open class TestCronJob {

    private val log = LoggerFactory.getLogger(this.javaClass)

    @Scheduled(cron = "2/3 * * * * *")
    open fun startOpenDraw() {
        log.error("执行时间：{}", LocalDateTime.now())

    }

}