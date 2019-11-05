package be.codekata

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class TestsShouldGoHere {

    @Test
    fun failingTest() {
        assertThat<Boolean>(false, equalTo<Boolean>(true))
    }
}