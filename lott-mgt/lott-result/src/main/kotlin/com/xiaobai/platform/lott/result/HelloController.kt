package com.xiaobai.platform.lott.result

import com.xiaobai.platform.lott.result.stream.SendHello
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *  @author  : xiaobai
 */
@RestController
@RequestMapping("/hello")
class HelloController(private val sendHello: SendHello) {

    @GetMapping("/{name}")
    fun sayHello(@PathVariable("name") name: String): String {
        sendHello.sendProcess(name)
        return "success"
    }

}