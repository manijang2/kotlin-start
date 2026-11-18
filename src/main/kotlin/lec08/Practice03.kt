package lec08

fun makeMessage(name: String): String {
    return "안녕하세요, ${name}."
}

fun showMessage(name: String) {
    println(makeMessage(name))
}

fun main() {
    val message: String = makeMessage("민수")
    println(message)
    showMessage("지수")
    println("출력을 마쳤습니다.")
}