package plyglot.dojo.compressor

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Test

class CompressorTest {

    // AB -> AB
    // AA -> 2A
    //ABB -> A2B

    @Test
    fun shouldReturnUnmodifiedInput() {
        assertEquals("A", compress("A"))
    }

    @Test
    fun shouldCombineTwoLettersToNumberAndLetter() {
        assertEquals("2A", compress("AA"))
        assertEquals("2B", compress("BB"))
    }
}