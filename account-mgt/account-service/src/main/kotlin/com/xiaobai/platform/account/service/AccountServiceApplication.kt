package com.xiaobai.platform.account.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class AccountServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(AccountServiceApplication::class.java, *args)
}
