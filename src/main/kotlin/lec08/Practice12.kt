package lec08

fun bestScore(vararg scores: Int): Int {
    var max = 0
    for (score in scores) {
        if (max < score) {
            max = score
        }
    }
    return max
}

fun resultLabel(score: Int, passing: Int = 60) =
    if (passing <= score) {
        "합격"
    } else {
        "재도전"
    }

fun printReport(name: String, passing: Int = 60, vararg scores: Int) {
    val maxScore = bestScore(*scores)
    val label = resultLabel(score = maxScore, passing = passing)
    println("${name}: ${maxScore} / ${label}")
}

fun main() {
    val scores = intArrayOf(50, 80, 60)

    printReport("민수", passing = 60, *scores)
    printReport("지수", 80, 70, 75)
    printReport("새싹")
}