package lec08

fun repeatText2(text: String, num: Int = 2, useNewLine: Boolean = true) {
    repeat(num) {
        if (useNewLine) {
            println(text)
        } else {
            print(text)
        }
    }
}

fun printBatch(vararg messages: String) {
    for (message in messages) {
        repeatText2(message, useNewLine = false)
        println("|")
    }
}

fun main() {
    val first = arrayOf("A", "B")
    val last = arrayOf("C")

    printBatch(*first, "중간", *last)
   repeatText2("끝", 1)
}