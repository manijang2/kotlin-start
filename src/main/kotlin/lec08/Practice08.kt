package lec08

fun repeatText(text: String, num: Int = 3, useNewLine: Boolean = true) {
    repeat(num ) {
        if (useNewLine) {
            println(text)
        } else {
            print(text)
        }
    }
}

fun main() {
    repeatText("A", useNewLine = false)
    println("|")
    repeatText("B", 2)
    repeatText("X", num = 0, useNewLine = false)
    println("끝")
}