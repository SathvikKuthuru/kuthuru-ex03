/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution03 {
    // ask the user for the quote
    // read the quote input from standard input
    // ask the user the name of who said it
    // read the name from standard input
    // print the name and quote to standard output

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the quote?");
        String quote = scan.nextLine();
        System.out.println("Who said it?");
        String name = scan.nextLine();
        System.out.println(name + " says, " + "\"" + quote + "\"");
    }
}
