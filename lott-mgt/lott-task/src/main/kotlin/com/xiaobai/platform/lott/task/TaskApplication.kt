package com.xiaobai.platform.lott.task

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 *
 *  @author  : xiaobai
 */
@SpringBootApplication
@ComponentScan("com.xiaobai.platform.lott")
//@EnableScheduling
class TaskApplicaton


fun main(args: Array<String>) {
    SpringApplication.run(TaskApplicaton::class.java)
}