import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Main
 {
     int id; int age;
     Employee(int id,int age)
     {
         this.id=id;
         this.age=age;
     }
     public int getid()
     {
         return id;
     }
     public int getage()
     {
         return age;
     }
 }

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int k=input.nextInt(); 
        Employee[] a=new Employee[k];
        if(k<1||k>10)
        {
            System.out.println("Invalid input");
            return;
        }
        for(int i=0;i<k;i++){
            int id=input.nextInt();
            int age=input.nextInt();
            
            if(id<10||id>1000||age<18||age>50)
            {
                System.out.println("Invalid data");
                return;
            }
            
            a[i]=new Employee(id,age);
        }
        
        int minage=Integer.MAX_VALUE;
        
        for(Employee emp:a){
            if(emp.getage()<minage)
            {
                minage=emp.getage();
            }
        }
        for(Employee emp:a)
        {
            if(emp.getage()<30&&emp.getage()==minage)
            {
                System.out.println(emp.getid()+ " " +emp.getage());
            }
        }
    }
}
