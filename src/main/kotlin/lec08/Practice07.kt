package lec08

fun decorate(text: String, prefix: String = "[", suffix: String = "]"): String {
    return prefix + text + suffix
}

fun main() {
    decorate("Kotlin", suffix = "?")
    decorate(suffix = ">", text = "Java", prefix = "<")
    decorate("")
}
