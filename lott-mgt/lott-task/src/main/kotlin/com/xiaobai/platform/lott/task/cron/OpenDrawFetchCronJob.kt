package com.xiaobai.platform.lott.task.cron

import com.xiaobai.platform.lott.task.random.DrawNumberGeneratorUtils
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.temporal.ChronoField

/**
 *
 *  @author  : xiaobai
 */
@Component
open class OpenDrawFetchCronJob {

    private val log = LoggerFactory.getLogger(this.javaClass)


    //@Scheduled(cron = "2/3 * * * * *")
    open fun startOpenDraw() {

        val localDateTime = LocalDateTime.now()
        val minute = localDateTime.get(ChronoField.MINUTE_OF_HOUR)
        val second = localDateTime.get(ChronoField.SECOND_OF_MINUTE)

        if (second == 0 && minute % 2 == 0 || true) {
            val openNumbers = DrawNumberGeneratorUtils.generateRandon2FSSC();
            log.info("现在时间：$localDateTime 开奖号码：$openNumbers")
        }

    }

}