package lec08

fun twiceBlock(value: Int): Int {
    return value * 2
}

fun twiceExpression(value: Int) = value * 2

fun announce(message: String) = println(message)

fun main() {
    println(twiceBlock(4))
    println(twiceExpression(-3))
    announce("완료")
}