package com.xiaobai.platform.lott.listenner;

import com.google.common.collect.Lists
import com.xiaobai.platform.lott.data.BettingSlip
import com.xiaobai.platform.lott.listenner.random.DrawNumberGeneratorUtils
import org.springframework.stereotype.Component

@Component
open class DrawResultEnricherSink {

    open fun processNormalIssueNo(issueNo: String, drawNumbers: String) {

        // 从redis中判断是否有该期号的订单

        //1. 从redis中获得订单
        this.processNonConsecutiveOrdersFromRedisDirectly(issueNo, drawNumbers)

        //2. 从数据库获得订单

    }

    private fun processNonConsecutiveOrdersFromRedisDirectly(issueNo: String, drawNumbers: String) {

        // 从redis中获得该期号的订单
        val originalOrders  = Lists.newArrayList<BettingSlip>()
        for (idx in 1 .. 100) {
            originalOrders.add(
                    BettingSlip(
                            DrawNumberGeneratorUtils.generateUserId(),
                            issueNo,
                            DrawNumberGeneratorUtils.generateMoney(),
                            DrawNumberGeneratorUtils.generateRandon2FSSC()))
        }

        // 把订单发送到kafka

        // 从redis中删除这些订单

//        originalOrders.forEach(::println)
    }



}
