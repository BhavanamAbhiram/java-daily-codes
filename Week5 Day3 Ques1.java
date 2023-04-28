import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main
{
    String name;
    int regNo;
    void display()
    {
        System.out.println(name+","+regNo);
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        Student s1=new Student();
        switch(choice)
        {
            case 1:
                input.nextLine();
                s1.name=input.nextLine();
                do{
                    s1.regNo=input.nextInt();
                }while(s1.regNo<=0);
            case 2:
                s1.display();
                break;
            default:
                System.out.println("Invalid");
        }
        
    }
}
