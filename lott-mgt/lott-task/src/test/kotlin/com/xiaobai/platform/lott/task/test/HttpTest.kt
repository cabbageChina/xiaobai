package com.xiaobai.platform.lott.task.test

import net.nullschool.util.DigitalRandom
import org.junit.Test
import java.util.stream.Collectors
import java.util.stream.IntStream

/**
 *
 *  @author  : xiaobai
 */
open class HttpTest {

    val digitalRandom = DigitalRandom()

    @Test
    open fun test() {
        val arrays1 = this.generatorNumbers()
        arrays1.forEach(::println)
    }

    fun generatorNumbers(): List<Int> = IntStream.range(0, 10).map{this.generatorNubmer()}.boxed().collect(Collectors.toList())

    fun generatorNubmer(): Int  = digitalRandom.nextInt(100)
}