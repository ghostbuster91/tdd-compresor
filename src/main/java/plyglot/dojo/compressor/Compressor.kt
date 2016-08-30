package plyglot.dojo.compressor

fun compress(input: String): String {
    return if (input.length <= 1) {
        input
    } else {
        "2" + input[0] + compress(input.substring(2))
    }
}

