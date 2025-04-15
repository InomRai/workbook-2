package com.pluralsight;
import java.util.Scanner;
public class Namegenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("enter your middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Enter Your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Your Name: " + firstName +" "+ lastName);
    }
}
