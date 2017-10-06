package com.xiaobai.platform.account.data.entity

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

/**
 *
 *  @author  : cabbage
 */
data class Account(
        val id: Long,
        val username: String,
        val password: String,
        @get:JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        val createTime: LocalDateTime
)