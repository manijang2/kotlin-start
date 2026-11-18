package lec08

fun printTags(vararg tags: String) {
    for (tag in tags) {
        println("[${tag}]")
    }
}

fun main() {
    printTags("함수", "", "인자")
    printTags()
    println("끝")
}