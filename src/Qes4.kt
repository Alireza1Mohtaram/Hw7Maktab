fun main() {
    while (true) {
        try {
            val input = readLine()!!.toInt()
            println(countSteps(input))
        } catch (e: Exception) {
            println(e.message)
        }
    }
}
fun countSteps(step: Int): Int {
    if (step == 0) return 0
    val stairs = Array<Int>(step+1){0}
    stairs[1] = 1
    stairs[2] = 2
    for (i in 3..step) {
        stairs[i] = stairs[i - 1] + stairs[i - 2]
    }
    println(stairs.contentToString())
    return stairs[step]
}