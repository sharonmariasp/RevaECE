package com.tnsif.day5;

import java.util.Scanner;

class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get customer's name
        System.out.println("Enter name");
        String name = scanner.nextLine();

        // Get source
        System.out.println("Enter source");
        String source = scanner.nextLine();

        // Get destination
        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        // Print the message
        String message = generateMessage(name, source, destination);
        System.out.println(message);

        scanner.close();
    }

    private static String generateMessage(String name, String source, String destination) {
        return "Dear " + name + ", welcome onboard with service from " + source + " to " + destination +"thank you for choosing sky Airlines.enjoy your flight";}
}


