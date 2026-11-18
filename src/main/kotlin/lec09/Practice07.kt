package lec09

fun main() {
    val person = Person("지수", 19)
    println(person.isAdult)
    person.age = 20
    println(person.isAdult)
    person.age = 0
    println(person.isAdult)
}