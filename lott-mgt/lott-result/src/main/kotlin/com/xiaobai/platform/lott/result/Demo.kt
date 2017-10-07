package com.xiaobai.platform.lott.result

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *  @author  : xiaobai
 */
@RestController
@RequestMapping("/demo")
open class Demo {

    @GetMapping("/")
    fun demo(): String {
        return "demo"
    }

}
