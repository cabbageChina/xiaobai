package com.xiaobai.platform.lott.data


open class Person(val id: Long, val name: String, val age: Int) {
    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }
}