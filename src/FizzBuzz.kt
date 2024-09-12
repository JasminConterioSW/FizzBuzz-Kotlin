fun main() {
    for (i in 1..100) {
        var output = buildString {
            if (i%3 == 0) { append("Fizz") }
            if (i%5 == 0) { append("Buzz") }
            if (i%7 == 0) { append("Bang") }
        }
        if (i%11 == 0) { output = "Bong" }
        if (i%13 == 0) { output = includeFezz(output) }

        output = output.ifBlank {i.toString()}
        println(output)
    }
}

fun includeFezz(inputString: String): String {
    if (inputString.isBlank()) {
        return "Fezz"
    }

    val sb = StringBuilder(inputString)
    if (inputString.indexOf("B") != -1) {
        sb.insert(sb.indexOf("B"), "Fezz")
    } else {
        sb.append("Fezz")
    }

    return sb.toString()
}

