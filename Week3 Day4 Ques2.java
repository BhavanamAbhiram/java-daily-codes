import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class Main
{

    public static void main(String[] args) 
    {
            Scanner abhi =new Scanner(System.in);
            double AB = abhi.nextDouble(); // Barrowed Amount-->BA
            double interest = AB*0.1; 
            double totalAmount = AB+ interest;
            double EMI = totalAmount / 12;

            DecimalFormat df = new DecimalFormat("#.##");
                System.out.println((int) totalAmount);
                System.out.println(df.format(EMI));
  }
}
