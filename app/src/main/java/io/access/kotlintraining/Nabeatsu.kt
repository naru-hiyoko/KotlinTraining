package io.access.kotlintraining

class NabeAtsu {
    var counter: Int = 0

    constructor() {
        //
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

    fun isAho(i: Int): Boolean {
        return this.counter % 3 == 0 || this.counter.toString().contains("3")
    }
}
