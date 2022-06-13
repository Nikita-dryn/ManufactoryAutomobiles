package bilder

import utility.PrintAvailabilityAutopilots
import random.*
import utility.PrintVehicle

class BuildOfProject
{
    private val randomOfSales = RandomOfSale()
    private  val printAvailabilityAutopilots = PrintAvailabilityAutopilots()
    private val printVehicle = PrintVehicle()
    private val justForBrief = justForBrief()

    fun buildOfProject()
    {
        val sailedAutomobiles = randomOfSales.randomOfSalesForYear()
        val sailedPickups = randomOfSales.randomOfSalesForYear()
        val sailedTrucks = randomOfSales.randomOfSalesForYear()
        val car = "Car"
        val pickup = "Pickup"
        val truck = "Truck"


        when
        {
            comparingNumbersOnTheMost(sailedAutomobiles, sailedPickups, sailedTrucks)  ->
            {
                instructionForWinner(car, sailedAutomobiles)
            }
            comparingNumbersOnTheMost(sailedAutomobiles, sailedPickups, sailedTrucks) ->
            {
                instructionForWinner(pickup, sailedPickups)
            }
            comparingNumbersOnTheMost(sailedAutomobiles, sailedPickups, sailedTrucks) ->
            {
                instructionForWinner(truck, sailedTrucks)
            }
        }
    }


    private fun instructionForWinner(nameOfVehicle: String, sailedVehicle: Int )
    {
        println("${printVehicle.printName(nameOfVehicle)} $justForBrief $sailedVehicle")
        comparingAutos(printVehicle.printName(nameOfVehicle))
    }

    fun comparingNumbersOnTheMost(firstNumber: Int, secondNumber: Int, thirdNumber: Int): Boolean =
        when
        {
            firstNumber > secondNumber && thirdNumber < firstNumber -> true
            secondNumber > firstNumber && thirdNumber < secondNumber -> true
            else -> false
        }


    private fun justForBrief() = printAvailabilityAutopilots.printWinningWithoutAutopilots()
    private fun justForBriefOnNextYear() = printAvailabilityAutopilots.printWinningWithoutAutopilotsOnNextYear()
    private fun amountOfSalesForNextYear() = randomOfSales.randomOfSalesForYear()
    private fun amountSaleWithAutopilots() = (amountOfSalesForNextYear() * (RandomOfAutopilot().setAutopilots() / 100)) * 100
    private fun calculateWithoutAP() = amountOfSalesForNextYear() - amountSaleWithAutopilots()
    private fun isMoreAutopilots() = calculateWithoutAP() > amountSaleWithAutopilots()

    private fun comparingAutos(item: String) =
        if(isMoreAutopilots()) println("$item ${justForBriefOnNextYear()} ${calculateWithoutAP()}")
        else println("$item + ${printAvailabilityAutopilots.printWinnerWA()} ${amountSaleWithAutopilots()}")
}