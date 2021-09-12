/*
    UCF COP3330 Fall 2021 Assignment 1 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;


public class ex02 {
    public static void main(String[] args) {
        // Variables / Objects
        Scanner readName = new Scanner(System.in);
        String input;
        int strLen;

        // User Prompt + Input
        System.out.print("What is the input string? ");
        input = readName.nextLine();
        strLen = input.length();

        // Return Message
        System.out.println(input + " has " + strLen + " characters.");

    }
}
