package lec09

fun main() {
    val person = Person("민수", 0)
    println(person.age)
    person.age = -1
    println(person.age)
    try {
        Person("지수", -1)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}