package tests

import bilder.BuildOfProject
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BuildOfProjectTest {

    val copyClass = BuildOfProject()

    @BeforeEach
    fun setUp()
    {
        println("Start")

    }

    @AfterEach
    fun tearDown()
    {
        println("Finish")
    }

    @Test
    fun comparingNumbersOnTheMost()
    {
        val x = copyClass.comparingNumbersOnTheMost(3,2,4)
        val y = copyClass.comparingNumbersOnTheMost(3,20,1)
        val z = copyClass.comparingNumbersOnTheMost(10, 5,8)
        assertEquals(false, x)
        assertEquals(true, y)
        assertEquals(true, z)

    }
}