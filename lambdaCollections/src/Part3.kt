fun main(){
//  part 3
    val words = listOf("apple","banana","kiwi","strawberry","grape")

    val sortedlist: (List<String>)->List<String> = {it -> it.sortedByDescending { it.length }}
    println(sortedlist(words))
//    fun sorted(words: List<String>):List<String>{
//        return words.sortedByDescending{it.length}
//    }
}