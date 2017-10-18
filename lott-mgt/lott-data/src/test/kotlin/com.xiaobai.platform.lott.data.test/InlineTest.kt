package com.xiaobai.platform.lott.data.test

import com.xiaobai.platform.lott.data.InlineObj
import com.xiaobai.platform.lott.data.Person
import com.xiaobai.platform.lott.data.Sing
import org.junit.Test
import java.util.concurrent.Executors
import java.util.concurrent.locks.ReentrantLock


open class InlineTest {

    @Test
    open fun s1Test() {
        Sing.s1()
    }

    @Test
    open fun userTest() {
        val person = Person(1L,"张三", 11)
        val (name, age) = person
        println("name is ${name}, age is ${age}")

    }


    @Test
    open fun accept() {
        val inlineObj = InlineObj()

        val num = inlineObj.accept { x -> x + 10 }

        println("num is ${num}")
    }

    @Test
    open fun execute() {

        val executor = Executors.newScheduledThreadPool(10)

        val lock = ReentrantLock()


        val inlineObj = InlineObj()

       executor.execute({
           inlineObj.inlineFun("a", lock, {a,b ->
               Thread.sleep(1000)
               "哈哈哈哈"
           })
       })

        executor.execute({
            inlineObj.inlineFun("b", lock, {a,b ->
                Thread.sleep(1000)
                "哈哈哈哈"
            })
        })

        executor.execute({
            inlineObj.inlineFun("c", lock, {a,b ->
                Thread.sleep(1000)
                "哈哈哈哈"
            })
        })


        Thread.sleep(5000)

    }


}