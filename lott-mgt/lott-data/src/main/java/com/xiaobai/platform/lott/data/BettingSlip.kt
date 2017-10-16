package com.xiaobai.platform.lott.data

import java.math.BigDecimal


data class BettingSlip(
        val userId: Long,
        val issueNo: String,
        val  bettingMoney: BigDecimal,
        val bettingNumbers: String)
