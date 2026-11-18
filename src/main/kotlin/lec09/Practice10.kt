package lec09

fun main() {
    val person = Person("kotlin")
    println(person.name)
    person.name = "java"
    println(person.name)
    person.name = ""
    println(person.name.length)
}