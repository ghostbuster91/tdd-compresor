package plyglot.dojo.compressor

fun compress(input: String): String {
    return if (input.length <= 1) {
        input
    } else if (hasSequence(input)) {
        val sequenceLength = squenceLenght(input)
        sequenceLength.toString() + input[0] + compress(input.substring(sequenceLength))
    } else {
        input[0] + compress(input.substring(1))
    }
}

fun squenceLenght(input: String) : Int{
    var sequenceLength = 0
    input.toCharArray().forEach {
        if(it == input[0]) {
            sequenceLength += 1
        } else {
            return@forEach
        }
    }
    return sequenceLength
}

fun hasSequence(input: String): Boolean {
    return input[0] == input[1]
}

