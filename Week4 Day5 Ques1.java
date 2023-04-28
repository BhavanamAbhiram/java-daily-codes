
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Main
{

 public static void main(String[] args) {
 Scanner sai=new Scanner(System.in);
 int n=sai.nextInt();
 double[][] caMarks=new double[n][];
 for (int i=0;i<n;i++) {
 int CA=sai.nextInt();
 caMarks[i]=new double[CA];
 for (int j=0;j<CA;j++) {
 caMarks[i][j]=sai.nextDouble();
 }
 }
 int subject=sai.nextInt();
 double sum=0;
 int CA=caMarks[subject-1].length;
 for (int i=0;i<CA;i++) {
 sum=sum+caMarks[subject-1][i];
 }
 double average=sum/CA;
 System.out.println("Average in Subject-" + subject+ " is " + average);

 }
 }
