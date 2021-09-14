package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        boolean complete = false;
        while (!complete) {
            System.out.println("What is the password?");
            String password = s.next();
            if (password.equals("abc$123")) {
                System.out.println("Welcome!");
                complete = true;
            } else {
                System.out.println("I don't know you.");
            }
        }
    }
}
