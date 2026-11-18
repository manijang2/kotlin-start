package lec09

class Visitor(
    val name: String = "방문자",
    val age: Int = 1,
)

fun main() {
    val first = Visitor("민수", 20)
    val second = Visitor("지수")
    val third = Visitor()
    println("${first.name}: ${first.age}")
    println("${second.name}: ${second.age}")
    println("${third.name}: ${third.age}")
}