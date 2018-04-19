package io.access.kotlintraining

import android.support.annotation.NonNull
import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        // TODO: implement to call hello function

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

    @Test
    fun testIsOdd()
    {
        assertEquals(true, 3.isOdd())
        assertEquals(true, 4.isEven())
    }

    @Test
    fun testDice() {
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
        println(d.counter)
    }

    @Test
    fun testNabeatsu() {
        val n = NabeAtsu(startWith = 21);
        assertEquals(n.next(), "22")
        assertEquals(n.next(), "Aho")
        assertEquals(n.next(), "Aho")
    }



}