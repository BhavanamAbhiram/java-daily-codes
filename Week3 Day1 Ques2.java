import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class Main 
{

    public static void main(String[] args) 
    {
            Scanner sai =new Scanner(System.in);
            double ABHI= sai.nextDouble(); // Barrowed Amount-->BA
            double interest = ABHI*0.1; 
            double totalAmount = ABHI + interest;
            double EMI = totalAmount / 12;

            DecimalFormat df = new DecimalFormat("#.##");
                System.out.println((int) totalAmount);
                System.out.println(df.format(EMI));
  }
}
