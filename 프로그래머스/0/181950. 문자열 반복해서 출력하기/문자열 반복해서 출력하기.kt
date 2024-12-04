fun main(args: Array<String>) {
    val input = readLine()!!.split(' ') 
    val result = (1..input[1].toInt()).joinToString("") { input[0] }
    println(result)
}