import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

  class Main
  {
      String name; int regno;
      
      void show(String name,int regno)
      {
          this.name=name; this.regno=regno;
          System.out.println(name+","+regno);
      }
  }
public class Solution 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt(); 
        Student a=new Student();
        if(choice==1)
        {
            input.nextLine();
            String name=sc.nextLine(); 
            int regno=sc.nextInt();
            while(regno<=0)
            {
                 regno=input.nextInt();
            }
                a.show(name,regno);
        }
        else if(choice==2)
        {
            a.show("null",0);
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
}
