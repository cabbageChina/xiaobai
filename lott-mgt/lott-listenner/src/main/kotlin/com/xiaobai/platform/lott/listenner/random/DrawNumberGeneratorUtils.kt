package com.xiaobai.platform.lott.listenner.random

import com.google.common.base.Joiner
import net.nullschool.util.DigitalRandom
import java.math.BigDecimal
import java.util.stream.Collectors
import java.util.stream.IntStream

open class DrawNumberGeneratorUtils {


    companion object {

        open fun generateUserId(): Long = generateRandonNumbers(0, 1000000, 1).stream().mapToLong { number -> number.toLong() }.findFirst().asLong

        open fun generateMoney(): BigDecimal = BigDecimal(generateRandonNumbers(0, 1000, 1).first())

        open fun generateRandon2FSSC (): String  = Joiner.on(",").join(generateRandonNumbers(smallest = 0, largest = 10, size = 5))

        private fun generateRandonNumbers(smallest: Int, largest: Int, size:Int): List<Int> {
            val random = DigitalRandom()
            return IntStream.range(0, size).map {random.nextInt(smallest, largest)}.boxed().collect(Collectors.toList())
        }

    }

}