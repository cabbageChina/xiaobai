package com.xiaobai.platform.account.data.entity

import java.time.Instant

/**
 *
 *  @author  : cabbage
 */
data class Account(
        val id: Long,
        val username: String,
        val password: String,
        val createTime: Instant
)