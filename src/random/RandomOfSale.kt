package random

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.random.Random

class RandomOfSale
{

    fun randomOfSalesForYear(): Int
    {
        val amountOfWeeksInYear = BigDecimal(365/7).setScale(2, RoundingMode.DOWN).toInt()
        var amount = 1
        var valueInYear = 0
        while(amount != amountOfWeeksInYear) {
            valueInYear += randomOfSalesForWeek()
            amount++
        }
        return valueInYear
    }


    private fun randomOfSalesForWeek():Int = Random.nextInt(1,10)

}