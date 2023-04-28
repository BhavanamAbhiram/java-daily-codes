import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Main
{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int empid=input.nextInt();
        input.nextLine();
        String name=input.nextLine();
        String post=input.nextLine();
        if(empid<=201)
        {
            System.out.println("No Appraisal");
        }
        else
        {
            System.out.println(name+","+empid+","+"21000");
        }
    }
}
