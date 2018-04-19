package io.access.kotlintraining

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello()
{
    println("Hello World!")

}
// TODO: declare hello function

fun fizzbuzz(i: Int): String
{
    val a = if ( i % 15 == 0) {
        "FizzBuzz"
    } else if (i%5 == 0){
        "Buzz"
    } else if (i%3==0) {
        "Fizz"
    } else {
        i.toString()
    }

    return a
}