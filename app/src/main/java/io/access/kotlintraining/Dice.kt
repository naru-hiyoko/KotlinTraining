package io.access.kotlintraining

import java.util.*

class Dice {
    var n: Int
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

    fun roll(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        if (trialLimit >= 100) {
            throw Exception("I was broken")
        }
        trialLimit += 1
        return Random().nextInt(this.n) + 1;
    }

}
