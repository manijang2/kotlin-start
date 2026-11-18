package lec09

class Member(
    val name: String,
    age: Int = 0,
) {
    var age = age
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("나이는 0 이상이어야 합니다.")
            }
            field = value
        }

    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 0 이상이어야 합니다.")
        }
    }

    val isAdult: Boolean
        get() = age >= 20
}

fun main() {
    val member = Member("지수")
    println("${member.age}, ${member.isAdult}")
    member.age = 20
    println("${member.age}, ${member.isAdult}")
    try {
        member.age = -1
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    println(member.age)
    try {
        Member("민수", -1)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}