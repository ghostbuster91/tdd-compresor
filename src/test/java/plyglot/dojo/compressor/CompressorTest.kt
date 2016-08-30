package plyglot.dojo.compressor

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class CompressorTest {

    // AB -> AB
    // AA -> 2A
    //ABB -> A2B

    @Test
    fun shouldReturnUnmodifiedInput() {
        assertEquals("A", compress("A"))
        assertEquals("AB", compress("AB"))
    }

    @Test
    fun shouldCombineTwoLettersToNumberAndLetter() {
        assertEquals("2A", compress("AA"))
        assertEquals("2B", compress("BB"))
    }

    @Test
    fun shouldHandlePairAndReturnRestUnmodified() {
        assertEquals("2AB", compress("AAB"))
        assertEquals("A2BA", compress("ABBA"))

    }

    @Test
    fun shouldHandleTwoPairs() {
        assertEquals("2A2B", compress("AABB"))
    }

    @Test
    fun shouldHandleATriplet() {
        assertEquals("3A", compress("AAA"))
    }
}