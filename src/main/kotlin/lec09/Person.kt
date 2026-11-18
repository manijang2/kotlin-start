package lec09

class Person(
    name: String,
    var age: Int,
) {
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이(-1)는 0 이상이어야 합니다.")
        }

        println("초기화: ${name}, ${age}")
    }

    constructor(name: String) : this(name, 1) {
        println("이름 생성자")
    }

    constructor() : this("방문자") {
        println("기본 생성자")
    }

    val isAdult: Boolean
        get() = age >= 20

    var name: String = name
        set(value) {
            field = value.uppercase()
        }

    val upperCaseName: String
        get() = name.uppercase()
}