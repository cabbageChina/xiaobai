package com.xiaobai.platform.lott.task

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

/**
 *
 *  @author  : xiaobai
 */
@SpringBootApplication
@EnableScheduling
open class TaskApplicaton


fun main(args: Array<String>) {
    SpringApplication.run(TaskApplicaton::class.java)
}