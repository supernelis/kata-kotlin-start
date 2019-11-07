package be.codekata


import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class TestsShouldGoHere {

    @Test
    fun failingTest() {
        assertThat<Boolean>(false, equalTo<Boolean>(true))
    }

    @ParameterizedTest
    @CsvSource(
        "0, ZERO",
        "1, ONE"
    )
    fun shouldReturnWord_When_Number(number: Int, word: String) {
        assertEquals(word, "")
    }
}