package utility

import java.time.Year

class PrintAvailabilityAutopilots
{
    companion object {
        const val IS_WINNING_IN_SALE_FOR = "is winning in sale for "
        const val AUTOPILOTS = "Autopilots"
        const val YEAR = "year"
        const val NEXT = "next"
        const val WITH = "with"
        const val WITHOUT = "without"
        const val AMOUNT = "amount"
    }
    fun printWinningWithoutAutopilots() = "$IS_WINNING_IN_SALE_FOR $YEAR $WITH $AMOUNT($WITHOUT $AUTOPILOTS): "
    fun printWinningWithoutAutopilotsOnNextYear()= "$IS_WINNING_IN_SALE_FOR $NEXT $YEAR $WITH $AMOUNT($WITHOUT $AUTOPILOTS): "
    fun printWinnerWA() = "$IS_WINNING_IN_SALE_FOR $NEXT $YEAR $WITH $AMOUNT($WITH $AUTOPILOTS): "
}