package com.xiaobai.platform.lott.data.test

import com.google.common.collect.Lists
import net.nullschool.util.DigitalRandom
import org.junit.Test
import java.util.stream.Collectors
import java.util.stream.IntStream

open class HttpTest {

    val digitalRandom = DigitalRandom()

    @Test
    open fun test() {
        val array1 = this.generatorNumbers(1)
        val array2= this.generatorNumbers(2)
        val array3 = this.generatorNumbers(3)


        println("未排序之前")
        array1.forEach{num -> print("${num.num} ,")}
        println()
        array2.forEach{num -> print("${num.num} ,")}
        println()
        array3.forEach{num -> print("${num.num} ,")}
        println()

        val allArray = arrayListOf<Num>()
        allArray.addAll(array1)
        allArray.addAll(array2)
        allArray.addAll(array3)

        val allSortedArray = allArray.stream().sorted{a,b -> b.num - a.num}.collect(Collectors.toList())

        allSortedArray.forEach {num -> println("${num.x}-${num.y}-${num.num} ,")}
        println()


    }

    fun generatorNumbers(x: Int): List<Num> = IntStream.range(0, 3).boxed().map { y -> this.generatorNubmer(x,y) }.collect(Collectors.toList())

    fun generatorNubmer(x: Int, y: Int): Num  = Num(x, y, digitalRandom.nextInt(100))
}

data class Num (val x: Int, val y: Int, val num: Int)