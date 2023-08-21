package com.example.androidkotlindesignpatterns

import org.junit.Test

class Component constructor(builder: Builder) {

    var param1: String? = null
    var param2: Int? = 0
    var param3: Boolean? = null

    class Builder {
        private var param1: String? = null
        private var param2: Int = 0
        private var param3: Boolean? = null

        fun setParam1(param1: String) = apply { this.param1 = param1 }
        fun setParam2(param2: Int) = apply { this.param2 = param2 }
        fun setParam3(param3: Boolean) = apply { this.param3 = param3 }
        fun setClient(param3: Boolean) = apply { this.param3 = param3 }

        fun getParam1() = param1
        fun getParam2() = param2
        fun getParam3() = param3

        fun create() = Component(this)

    }

    init {
        param1 = builder.getParam1()
        param2 = builder.getParam2()
        param3 = builder.getParam3()
    }
}

class ComponentTest {

    @Test
    fun builderTest() {
        val component = Component.Builder()
            .setParam1("Some value")
            .setParam2(12)
            .setParam3(true)
            .create()

        println("_______________")
        println(component.param1)
        println(component.param2)
        println(component.param3)
        println("_______________")

    }
}