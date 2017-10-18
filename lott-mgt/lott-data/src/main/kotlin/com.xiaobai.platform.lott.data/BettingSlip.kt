package com.xiaobai.platform.lott.data

import java.math.BigDecimal


data class BettingSlip(
        val userId: Long,
        val issueNo: String,
        val  bettingMoney: BigDecimal,
        val bettingNumbers: String) {

    override fun toString(): String {
        return "BettingSlip(userId=$userId, issueNo='$issueNo', bettingMoney=$bettingMoney, bettingNumbers='$bettingNumbers')"
    }

}
