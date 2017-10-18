package com.xiaobai.platform.lott.listenner

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

/**
 *
 *  @author  : xiaobai
 */
@SpringBootApplication
//@EnableScheduling
open class ListennerApplication

fun main(args: Array<String>) {
    SpringApplication.run(ListennerApplication::class.java)
}