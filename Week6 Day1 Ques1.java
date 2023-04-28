import java.util.*;

 class Main
{
    public static void main(String[] args) 
    {
Scanner input = new Scanner(System.in);
        int n = input.nextInt();        
        if (n<10||n>50) 
        {
            System.out.println("Invalid");
        } 
        else 
        {
            List<Integer> factors = getPrimeFactors(n);
            for (int factor : factors) 
            {
                System.out.print(factor + " ");
            }
        }
    }
    
    public static List<Integer> getPrimeFactors(int n) 
    {
        List<Integer> factors = new ArrayList<>();
        for (int i=2;i<=n;i++) 
        {
            while (n%i==0) 
            {
                factors.add(i);
                n/=i;
            }
        }
        return factors;
    }
}
