package com.softserveinc;

import java.util.Scanner;

/*
    Write a program that determines the minimum of a sequence positive numbers (the length of the sequence is not limited).

    The user should input the numbers until enter a zero or negative number.

    The example below shows how your output might look. The symbol >>> represents the user input.
    Notice that it's not the part of the input.

    Enter the number after symbol >>>. To exit enter a zero.
    >>> 12
    >>> 75
    >>> 10
    >>> 9
    >>> 23
    >>> 0
    Minimum number is 9
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Write your code here
        int min =Integer.MAX_VALUE;
        int num;
        do {
            System.out.print(">>> ");
            num = scanner.nextInt();
            if (num <= 0) {
                break;
            }
            if (num < min) {
                min = num;
            }
        } while (true);
        System.out.println("Minimum number is " + min);
        }
    }

