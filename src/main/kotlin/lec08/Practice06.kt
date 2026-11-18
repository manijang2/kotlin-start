package lec08

fun makeLabel(text: String, prefix: String = "[", suffix: String = "]"): String {
    return prefix + text + suffix
}

fun main() {
    println(makeLabel("Kotlin"))
    println(makeLabel("Kotlin", "<"))
    println(makeLabel("Kotlin", "<", ">"))
    println(makeLabel(""))
}