import kotlin.math.max

fun main() {
    val arr = arrayOf(1,2,-4,2,2)
    println(maxSubArraySum(arr , 0,arr.size-1))
}
fun maxCrossingSum(arr: Array<Int>, l: Int, m: Int, h: Int): Int {
    var sum = 0
    var left = Int.MIN_VALUE
    for (i in m downTo l) {
        sum += arr[i]
        if (sum > left) left = sum
    }
    sum = 0
    var rightSum = Int.MIN_VALUE
    for (i in m + 1..h) {
        sum += arr[i]
        if (sum > rightSum) rightSum = sum
    }
    return max(left + rightSum, max(left, rightSum)
    )
}

fun maxSubArraySum(arr: Array<Int>, l: Int, h: Int): Int {
    if (l == h) return arr[l]
    val m = (l + h) / 2
    return max(
        max(maxSubArraySum(arr, l, m), maxSubArraySum(arr, m + 1, h)), maxCrossingSum(arr, l, m, h)
    )
}
