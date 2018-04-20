package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Exercise1 の回答です。
 * */

class TestExercise1 {

    @Test
    fun testHello() {
        hello()
    }

    @Test
    fun testFizzBuzz() {
        for (i in 1..100) {
            val ret = fizzbuzz(i);
            //println(ret)
        }

        assertEquals("FizzBuzz", fizzbuzz(15));
        assertEquals("Fizz", fizzbuzz(6));
        assertEquals("Buzz", fizzbuzz(10));

    }

    @Test
    fun testIsLeapYear() {
        // 閏年で無い
        assertEquals(false, isLeapYear(1700))
        assertEquals(false, isLeapYear(1800))
        assertEquals(false, isLeapYear(1900))

        assertEquals(false, isLeapYear(2100))
        assertEquals(false, isLeapYear(2200))
        assertEquals(false, isLeapYear(2300))

        assertEquals(false, isLeapYear(2500))
        assertEquals(false, isLeapYear(2600))

        //閏年
        assertEquals(true, isLeapYear(1600))
        assertEquals(true, isLeapYear(2000))
        assertEquals(true, isLeapYear(2400))

    }

    @Test
    fun testPowerFunc() {
        assertEquals(9.toLong(), power(3, 2))
    }

}