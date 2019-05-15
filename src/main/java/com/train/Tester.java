package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter number of tickets: ");
            int tickets = scanner.nextInt();
            if (tickets == -1){
                System.out.println("Exit");
                break;
            }
            System.out.print("How many round-trip tickets: ");
            int round_trip = scanner.nextInt();
            Ticket t = new Ticket(tickets, round_trip);
            t.print();
        }

    }
}
