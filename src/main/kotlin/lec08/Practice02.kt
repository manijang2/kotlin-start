package lec08

fun status(score: Int): String =
    if (score >= 60) {
        "합격"
    } else {
        "재도전"
    }

fun main() {
    println(status(60))
    println(status(59))
    println(status(100))
}