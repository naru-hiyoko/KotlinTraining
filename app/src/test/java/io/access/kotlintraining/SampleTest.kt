package io.access.kotlintraining

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
    fun testFizzBuzz()
    {
        for (i in 1..100)
        {
            val ret = fizzbuzz(i);
            println(ret)
        }
    }
}