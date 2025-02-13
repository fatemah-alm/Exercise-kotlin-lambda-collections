import java.awt.List
import javax.print.DocFlavor.STRING

fun main() {

    // part 1
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val doubledList = numbers.map{ it*2 }
    println(doubledList)



}




//fun filteringA (name:String):Boolean{
//    return name.startsWith('A')
//}
