package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello() {
    println("Hello World!")

}
// TODO: declare hello function

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

