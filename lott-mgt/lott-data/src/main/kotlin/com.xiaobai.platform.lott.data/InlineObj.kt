package com.xiaobai.platform.lott.data

import java.util.concurrent.locks.Lock

open class InlineObj {

    inline fun <T> inlineFun(name: String, lock: Lock, body: (a: Int, b: Int) -> T): T {
        lock.lock()
        try {
            println("我是${name}已经执行完成")
            return body(1, 2)
        } finally {
            lock.unlock()
        }
    }

    inline fun <T> inlineFun2(name: String, lock: Lock, body: (a: Int, b: Int) -> T, noinline body2: (a: Int, b: Int) -> T): T {
        lock.lock()
        try {
            println("我是${name}已经执行完成")
            return body(1, 2)
        } finally {
            lock.unlock()
        }
    }

    fun <T> nornaLinline(name: String, lock: Lock, body: (a: Int, b: Int, c: String, d: Int) -> T): T {
        lock.lock()
        try {
            println("我是${name}已经执行完成")
            return body(1, 2, "3", 5)
        } finally {
            lock.unlock()
        }
    }

    fun accept(dec: Int.(other: Int) -> Int): Int {
        //  定义了一个 Receiver
        val i = 100
        return i.dec(10)
    }



}