import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Main {

 public static void main(String[] args) {
 Scanner sai=new Scanner(System.in);
 sai.next();
 sai.next();
 sai.next();
 sai.next();
 int n=sai.nextInt();
 int o=n;
 int i=0;
 int sum=0,pro=1,m,p;

 while(n>0)
 {
 m=n%10;
 p=m;
 pro=pro*m;
 sum+=m;
 n=n/10;
 i++;
 }
     if(o<10||o>99)
 {
 System.out.println("Invalid Input");
         return;
 }
     if((sum+pro)==o)
 {
     System.out.println("Special two digit number");
     }
 else{
 System.out.println("Not a special two digit number");

 }
 }
}
