fun main() {
    for (i in 1..100) {
        var output = buildString {
            if (i%3 == 0) { append("Fizz") }
            if (i%5 == 0) {append("Buzz") }
        }

        output = output.ifBlank {i.toString()}
        println(output)
    }
}