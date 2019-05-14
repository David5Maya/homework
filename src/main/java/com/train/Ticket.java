package com.train;

public class Ticket {
    int fare = 1000;
    float discount = 0.9f;
    int tickets;
    int round_trip;

    public Ticket(int tickets, int round_trip) {
        this.tickets = tickets;
        this.round_trip = round_trip;
    }

    public int total(){
        int total = 0;
        int one_way_fare = 0;
        Float round_trip_fare = 0f;
        one_way_fare = (tickets - round_trip) * fare;
        round_trip_fare = round_trip * fare * 2 * discount;
        total = one_way_fare + round_trip_fare.intValue();
        return total;
    }
    public void print(){
        System.out.println("Total tickets: " + tickets);
        System.out.println("Round-trip: " + round_trip);
        System.out.println("Total: " + total());
    }
}
