fun main(args: Array<String>) {
    val str = readLine()!!
    println( 
        str.map { 
            if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase() 
        }.joinToString("")
    )
}

