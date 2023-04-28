/*1 QUESTION
Write a program to take the 2 inputs of integer type from the user. Display the values separated by symbol ‘-’ if the values are positive otherwise display the message 
“Invalid Input”.
// CODE FOR THE QUESTION*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
{
        Scanner abhi = new Scanner(System.in);
        int a = abhi.nextInt();
        int b = abhi.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(a + "-" + b);
        } 
        else
        {
            System.out.println("Invalid Input");
        }
        }
}

