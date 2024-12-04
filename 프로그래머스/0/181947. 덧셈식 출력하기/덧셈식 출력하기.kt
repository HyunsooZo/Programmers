fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(a add b) 
}

infix fun Int.add(b: Int): String {
    return "$this + $b = ${this + b}"
}