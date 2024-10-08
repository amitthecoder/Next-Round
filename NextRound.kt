fun main() {
    val n = readln()
    val x = n.split(" ").map { it.toInt() }
    val a =x[0]
    val b =x[1]
    val nn = readln()
    val numbers = nn.split(" ").map { it.toInt() }
    var count = 0
    for (i in 0..<a) {
        if (numbers[i] >= numbers[b-1] && numbers[i] != 0) {
            count++
        }
    }
    println(count)
}
