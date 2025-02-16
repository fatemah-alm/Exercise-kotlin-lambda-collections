fun main(){
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val squareOdd = processNumbers(numbers,filter = {it %2 !=0}, square = {it * it} )
    println(squareOdd)

}


fun processNumbers(numbers: List<Int>,filter:(Int)->Boolean, square:(Int)-> Int ):List<Int>{
return numbers.filter(filter).map(square)
}