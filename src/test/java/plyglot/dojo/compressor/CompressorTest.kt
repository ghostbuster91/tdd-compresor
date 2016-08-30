package plyglot.dojo.compressor

import org.junit.Assert
import org.junit.Test

class CompressorTest {

    // AB -> AB
    // AA -> 2A
    //ABB -> A2B

    @Test
    fun shouldReturnUnmodifiedInput() {
        Assert.assertEquals("A", compress("A"))
    }
}