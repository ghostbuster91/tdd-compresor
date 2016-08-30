package plyglot.dojo.compressor

fun compress(input: String): String {
    return if (input.length > 1 && input[0] == input[1]) "2" + input[0] else input
}

