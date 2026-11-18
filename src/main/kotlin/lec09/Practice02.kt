package lec09

class Badge(
    prefix: String,
    number: Int
) {
    val label: String = "${prefix}-${number}"
}

fun main() {
    println(Badge("K", 7).label)
    println(Badge("", 0).label)
}