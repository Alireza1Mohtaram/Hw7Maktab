fun main() {

    var str = readLine().toString()
    var flag = false

    for (i in 0 until str.length -1){
        if (isPair(str[i],str[i+1])) flag = true
    }
    println(flag)
}
fun isPair(left: Char, right: Char): Boolean {
    return left == '{' && right == '}' || left == '(' && right == ')' || left == '[' && right == ']'
}