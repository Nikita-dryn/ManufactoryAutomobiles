package tests

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import random.RandomOfSale

internal class RandomOfSaleTest {

    val copyOfRandomOfSaleTest = RandomOfSale()

    @BeforeEach
    fun setUp()
    {
        println("Copy of class is created")
    }

    @AfterEach
    fun tearDown()
    {
        println("Finished")
    }

    @Test
    fun randomOfSalesForYear()
    {
        copyOfRandomOfSaleTest.randomOfSalesForYear()
    }
}