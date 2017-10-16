package com.xiaobai.platform.lott.task

import com.xiaobai.platform.lott.task.cron.OpenDrawFetchCronJob
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *  @author  : xiaobai
 */
@RestController
open class HelloController(private val openDrawFetchCronJob: OpenDrawFetchCronJob) {

    @GetMapping("/sayHello")
    open fun sayHello() = "hello"

    @GetMapping("/drawLott")
    open fun drawLott(): String {
        openDrawFetchCronJob.startOpenDraw()
        return "success"
    }

}