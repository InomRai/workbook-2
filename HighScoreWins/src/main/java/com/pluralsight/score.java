package com.pluralsight;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Game score (Home:Visitor|21:9");
        String gameScore = scanner.nextLine();

        String[] parts = gameScore.split("\\|");
        String[] teams = gameScore.split(":");
        String[] score = gameScore.split(":");

        String homeTeam = teams[0].trim();
        String visitorTeam = teams[1].trim();

        int homeScore = Integer.parseInt(score[0].trim());
        int visitorScore = Integer.parseInt(score[1].trim());

        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("It's a tie");
        }





        }
    }
