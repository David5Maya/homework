package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    while(true) {
        print("Please enter number of tickets: ")
        var tickets = scanner.nextInt()
        if (tickets == -1){
            println("Exit")
            break
        }
        print("How many round-trip tickets: ")
        var round_trip = scanner.nextInt()
        val t = TicketKT(tickets, round_trip)
        t.print()
    }
}

class TicketKT(var tickets : Int, var round_trip : Int){
    val fare = 1000
    val discount = 0.9f
    fun total() : Int {
        var one_way_fare : Int = (tickets - round_trip) * fare
        var round_trip_fare :Float = round_trip * fare * 2 * discount
        return one_way_fare + round_trip_fare.toInt()
    }
    fun print(){
        println("Total tickets: $tickets")
        println("Round-trip: $round_trip")
        println("Total: ${total()}")
    }

}