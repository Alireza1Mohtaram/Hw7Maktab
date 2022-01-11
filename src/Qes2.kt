fun main() {

    var str = readLine().toString()
    var flag = false
    val stack = mutableListOf<Char>()

     for (char in str) {

        if (char == '}') {
            if (!isPair(stack.removeLast(), '}')) break
            else flag = true
        } else if (char == ')') {
            if (!isPair(stack.removeLast(), ')')) break
            else flag = true
        } else if (char == ']') {
            if (!isPair(stack.removeLast(), ']')) break
            else flag = true
        } else {
            stack.add(char)
        }
    }
    println(flag)
}
fun isPair(left: Char, right: Char): Boolean {
    return left == '{' && right == '}' || left == '(' && right == ')' || left == '[' && right == ']'
}
