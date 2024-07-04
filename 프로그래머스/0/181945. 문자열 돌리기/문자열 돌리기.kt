fun main(args: Array<String>) {
    val s1 = readLine()!!
    s1.split("").filter { it.isNotEmpty() }.forEach { char ->
        println(char)
    }
}
