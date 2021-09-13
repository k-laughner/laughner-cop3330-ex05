/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the first number?");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();

        System.out.println("What is the second number?");
        Scanner input2 = new Scanner(System.in);
        int second = input.nextInt();

        int add = first + second;
        int subtract = first - second;
        int multiply = first*second;
        int divide = first/second;

        System.out.println(first + " + " + second + " = " + add + "\n"
                + first + " - " + second + " = " + subtract + "\n"
                + first + " * " + second + " = " + multiply + "\n"
                + first + " / " + second + " = " + divide);
    }
}