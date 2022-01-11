import kotlin.math.min

fun main() {

    var strs : MutableList<String> = readLine().toString().split(',') as MutableList<String>
    checkValidition(strs)
    println(strs)
    findPrefixStr(strs)
}
fun findPrefixStr(strs: MutableList<String>) {

    var minIndex = findMinLength(strs)
    var strMin = strs[minIndex]
    var strPerfix = ""
    strs.removeAt(minIndex)
    strs.forEach(){
        strPerfix = greatestCommonPrefix(it,strMin)!!
    }
    if(strPerfix.isEmpty()) strPerfix="\" \" "
    println(strPerfix)
}
fun findMinLength(strs: MutableList<String>): Int {
    var min = Int.MAX_VALUE
    var indexMin = 0
    strs.forEachIndexed(){ index , it ->
       if (it.length <= min  ){
           min = it.length
           indexMin = index
       }
    }
    return indexMin
}
fun checkValidition (strs: MutableList<String>){

    val pattern  = "[a-z]+".toRegex()

    var sizeOfList= strs.size
    var i = 0
    while (i < sizeOfList) {

        if (!pattern.matches(strs[i])) {
            strs.removeAt(i)
            sizeOfList--
        }
        i++
    }
}
fun greatestCommonPrefix(a: String, b: String): String{

    val minLength = min(a.length, b.length)
    for (i in 0 until minLength) {
            if (a[i] != b[i]) {
                return a.substring(0, i)
            }
    }
    return a.substring(0, minLength)

}
