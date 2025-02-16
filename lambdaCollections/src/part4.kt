fun main(){
   val greaterThanFive =  customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it > 5 }
    val evenNumbers = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 2 == 0 }
    val multiplesOfThree = customFilter(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) { it % 3 == 0 }


    println(greaterThanFive)
    println(evenNumbers)
    println(multiplesOfThree)

}



fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int>{
return numbers.filter(filter)
}

