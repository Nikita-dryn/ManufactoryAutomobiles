package random

import java.math.BigDecimal
import java.math.RoundingMode.DOWN
import kotlin.random.Random.Default.nextInt

class RandomOfSale
{
    fun randomOfSalesForYear(): Int
    {
        val daysOfYear = 365
        val daysOfWeek = 7

        val amountOfWeeksInYear = BigDecimal(daysOfYear.div(daysOfWeek)).setScale(2, DOWN ).toInt()
        var amount = 0
        var valueInYear = 0
        //FIXME: delete this fucking code
        while(amountOfWeeksInYear >= amount)
        {
            valueInYear += randomOfSalesForWeek()
            amount++
        }
        return valueInYear
    }
    private fun randomOfSalesForWeek():Int = nextInt(1,10)

}