package lec09

class Profile(
    val id: String,
    name: String,
) {
    var name: String = name.uppercase()
        set(value) {
            field = value.uppercase()
            println("변경: ${field}")
        }

    init {
        println("초기화: ${this.id}, ${this.name}")
    }

    constructor(name: String) : this("P-1", name) {
        println("부 생성자")
    }
}

fun main() {
    val profile = Profile("kotlin")
    println(profile.name)
    profile.name = "java"
    println("${profile.id}: ${profile.name}")
}