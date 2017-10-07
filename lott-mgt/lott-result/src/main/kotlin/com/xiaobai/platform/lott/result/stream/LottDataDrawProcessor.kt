package com.xiaobai.platform.lott.result.stream

import org.springframework.cloud.stream.annotation.Input
import org.springframework.cloud.stream.annotation.Output
import org.springframework.messaging.MessageChannel
import org.springframework.messaging.SubscribableChannel

/**
 *
 *  @author  : xiaobai
 */

interface LottDataDrawSource {

    companion object {
        const val OUTPUT = "lottDataDrawOutput"
    }

    @get:Output(LottDataDrawSource.OUTPUT)
    val output: MessageChannel

}


open interface LottDataDrawSink {

    companion object {
        const val INPUT = "lottDataDrawInput"
    }

    @Input(LottDataDrawSink.INPUT)
    fun input(): SubscribableChannel

}