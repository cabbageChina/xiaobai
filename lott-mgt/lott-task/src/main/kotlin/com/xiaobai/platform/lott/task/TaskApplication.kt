package com.xiaobai.platform.lott.task

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableScheduling

/**
 *
 *  @author  : xiaobai
 */
@SpringBootApplication
@ComponentScan("com.xiaobai.platform.lott")
//@EnableScheduling
open class TaskApplicaton


fun main(args: Array<String>) {
    SpringApplication.run(TaskApplicaton::class.java)
}