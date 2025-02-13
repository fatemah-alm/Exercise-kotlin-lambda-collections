fun main(){
    // part 2
    val names = listOf("Alice","Bob", "Amir", "Charlie", "Annie", "David","Fatima")
    println(filterNames(names,func))
}


fun filterNames(names: List<String>, func: (String)->Boolean ):List<String>{
    return names.filter(func)
}

val func: (String)->Boolean = {name -> name.startsWith('A')}