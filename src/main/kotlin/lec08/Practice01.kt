package lec08

fun minValue(a: Int, b: Int): Int {
    return if (a < b) {
        a
    } else {
        b
    }
}

fun main() {
    println(minValue(7, 3))
    println(minValue(-4, 2))
    println(minValue(5, 5))
}