package io.access.kotlintraining
import java.util.Random

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello() {
    println("Hello World!")
}

// TODO: declare hello function

/***
 * FizzBuzz 問題
 */

fun fizzbuzz(i: Int): String {
    val a = if (i % 15 == 0) {
        "FizzBuzz"
    } else if (i % 5 == 0) {
        "Buzz"
    } else if (i % 3 == 0) {
        "Fizz"
    } else {
        i.toString()
    }

    return a
}

/**
 * うるう年の問題
 * */
fun isLeapYear(y: Int): Boolean {
    if (y % 4 == 0) {
        if (y % 100 == 0 && y % 400 != 0) {
            return false
        } else {
            return true
        }
    } else {
        return false
    }
}

/**
 * 累乗の問題
 * */

fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }
    // TODO: 実装する

    var arr = ArrayList<Int>();
    for (i in 1..n) {
        arr.add(a);
    }

    return arr.reduce { acc, a -> acc * a }.toLong();
}

/**
 * Class Extension の課題
 * */

fun Int.isOdd() : Boolean {
    return if (this % 2 == 1) {
        return true;
    } else {
        return false
    }
}

fun Int.isEven() : Boolean {
    return if (this % 2 == 0) {
        return true;
    } else {
        return false
    }
}

/**
 * Exercise 3
 * Null 安全の確認
 *
 * */

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    // TODO: 実装する
    //val personalInfo: PersonalInfo? = client?.personalInfo
    val email: String? = client?.personalInfo?.email
    email?.let {
        if (message != null) {
            mailer.sendMessage(it, message)
        }
    }
}

// コンパイル通すための諸々
class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

