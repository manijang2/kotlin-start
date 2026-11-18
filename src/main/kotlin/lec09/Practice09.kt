package lec09

fun main() {
    val person = Person("kotlin")
    println(person.name)
    println(person.upperCaseName)
    person.name = "java"
    println(person.name)
    println(person.upperCaseName)
}