package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Exercise 2 の回答です。
 * */

class TestExercise2 {

    @Test
    fun testIsOdd()
    {
        assertEquals(true, 3.isOdd())
        assertEquals(true, 4.isEven())
    }

    @Test
    fun testDice() {
        // インスタンスの生成, 3面のサイコロで 98 回目から開始する。 100 回目で例外が発生する。
        var d = Dice(3, 98)

        try {
            println(d.roll())
            println(d.roll())
            println(d.roll())
        } catch (e: Exception) {
            println(e)
        }

        d.propertyWithCounter = 100
        d.propertyWithCounter = 200
        assertEquals(d.counter, 2)
    }

    @Test
    fun testNabeatsu() {
        // ナベアツの問題、
        val n = NabeAtsu(startWith = 21);
        assertEquals(n.next(), "22")
        assertEquals(n.next(), "Aho")
        assertEquals(n.next(), "Aho")
    }

}