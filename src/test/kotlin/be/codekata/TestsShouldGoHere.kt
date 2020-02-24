package be.codekata


import io.mockk.mockk
import io.mockk.verify
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

    @Test
    internal fun mockThisThingWithMockk() {
        val something = mockk<Something>(relaxed = true)

        val someOtherThing = SomeOtherThing(something)
        someOtherThing.triggerTest()

        verify {
            something.test()
        }
    }

    class SomeOtherThing(private val something: Something) {
        fun triggerTest() {
            something.test()
        }

    }

    class Something {
        fun test() {
        }
    }
}