package com.xiaobai.platform.account.api

import com.xiaobai.platform.account.data.entity.Account
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 *
 *  @author  : cabbage
 */
@RequestMapping("/account")
interface AccountApi {

    @GetMapping("/{id}")
    fun get(@PathVariable("id") id: Long): Account

    @GetMapping
    fun all(): MutableList<Account>

    @PostMapping
    fun create(account: Account)

}
