package bilder

import printusefull.PrintUsefull
import random.RandomOfAutopilot
import kotlin.test.todo

class BuildOfProject
{

    fun buildOfProject()
    {
        val sailedAutomobiles = random.RandomOfSale().randomOfSalesForYear()
        val sailedPickups = random.RandomOfSale().randomOfSalesForYear()
        val sailedTrucks = random.RandomOfSale().randomOfSalesForYear()

        when
        {
            sailedAutomobiles > sailedPickups and sailedTrucks ->
            {
                println("${PrintUsefull().printAutomobile()} ${justForBrief()} $sailedAutomobiles")
                comparingAmountsWithAndWithoutAutopilots(PrintUsefull().printAutomobile())
            }
            sailedPickups > sailedAutomobiles and sailedTrucks ->
            {
                println("${PrintUsefull().printPickup()} ${justForBrief()} $sailedPickups")
                comparingAmountsWithAndWithoutAutopilots(PrintUsefull().printPickup())
            }
            sailedTrucks > sailedAutomobiles and sailedPickups ->
            {
                println("${PrintUsefull().printTruck()} ${justForBrief()} $sailedTrucks")
                comparingAmountsWithAndWithoutAutopilots(PrintUsefull().printTruck())
            }
        }


    }

    private fun justForBrief() = PrintUsefull().printWinningWithoutAutopilots()
    private fun justForBriefOnNextYear() = PrintUsefull().printWinningWithoutAutopilotsOnNextYear()
    private fun amountOfSalesForNextYear() = random.RandomOfSale().randomOfSalesForYear()
    private fun amountSaleWithSetAutopilots() = (amountOfSalesForNextYear() * (RandomOfAutopilot().setAutopilots() / 100)) * 100

    private fun comparingAmountsWithAndWithoutAutopilots(item: String)
    {
        val amountVehicleWithoutAutopilots = amountOfSalesForNextYear() - amountSaleWithSetAutopilots()
        if(amountVehicleWithoutAutopilots > amountSaleWithSetAutopilots())
        {
            println("$item ${justForBriefOnNextYear()} $amountVehicleWithoutAutopilots")

        }
        else if(amountVehicleWithoutAutopilots < amountSaleWithSetAutopilots())
        {
            println("$item + ${PrintUsefull().printWinningWithAutopilots()}  ${amountSaleWithSetAutopilots()}")
        }

    }
}