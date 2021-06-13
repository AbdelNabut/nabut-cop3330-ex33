/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */


package ex33;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String[] Choices = {"Yes", "No", "Maybe", "Ask again later"};
        String question;
        Scanner input = new Scanner(System.in);
        System.out.print("What's your question? ");
        question = input.next();
        String choice = Choices[(int)(Math.random() * 4)];
        System.out.println(choice);
    }
}
