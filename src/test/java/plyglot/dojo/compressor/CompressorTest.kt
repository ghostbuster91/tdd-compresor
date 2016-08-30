package plyglot.dojo.compressor

import org.junit.Assert
import org.junit.Test

class CompressorTest {

    @Test
    fun shouldReturnUnmodifiedInput() {
        Assert.assertEquals("A", compress("A"))
    }
}