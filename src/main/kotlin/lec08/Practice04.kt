package lec08

fun greet(name: String = "손님", greeting: String = "안녕하세요"): String {
    return "${greeting}, ${name}!"
}

fun main() {
    println(greet())
    println(greet("민수"))
    println(greet("지수", "반갑습니다"))
}