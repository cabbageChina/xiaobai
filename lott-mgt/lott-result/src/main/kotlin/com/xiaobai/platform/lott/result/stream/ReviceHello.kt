package com.xiaobai.platform.lott.result.stream

import org.slf4j.LoggerFactory
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.messaging.Message

/**
 *
 *  @author  : xiaobai
 */
@EnableBinding(LottDataDrawSink::class)
class ReviceHello {

    val log = LoggerFactory.getLogger(ReviceHello::class.java);

    @StreamListener(value = LottDataDrawSink.INPUT)
    fun revice(message: Message<ByteArray>) {

        val msg = String(message.payload)
        log.info("收到的信息：$msg")
    }


}