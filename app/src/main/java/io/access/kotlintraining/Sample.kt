package io.access.kotlintraining
import java.util.Random

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

interface DiceInterface {
    var n: Int
    fun roll(): Int
}

class Dice : DiceInterface {
    override var n: Int
    private var trialLimit = 0

    internal var counter: Int = 0

    var propertyWithCounter: Int = 0
        set(value) {
            this.counter += 1
        }


    constructor(n: Int) {
        this.n = n
    }

    constructor(n: Int, trial: Int) {
        this.n = n
        this.trialLimit = trial
    }

    init {
        //
    }

    override fun roll(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (trialLimit >= 100) {
            throw Exception("I was broken")
        }
        trialLimit += 1
        return Random().nextInt(this.n) + 1;
    }

}


class NabeAtsu {
    var counter: Int = 0

    constructor() {

    }

    constructor(startWith: Int) {
        this.counter = startWith
    }

    fun next(): String {
        this.counter += 1

        if (isAho(this.counter)) {
            return "Aho"
        } else {
            return this.counter.toString()
        }
    }

    fun isAho(i: Int): Boolean
    {
        return this.counter % 3 == 0 || this.counter.toString().contains("3")
    }


}


