package com.xiaobai.platform.lott.task

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *  @author  : xiaobai
 */
@RestController
open class HelloController{

    @GetMapping("/sayHello")
    open fun sayHello() = "hello"

    @GetMapping("/drawLott")
    open fun drawLott(): String {
        return "success"
    }

}