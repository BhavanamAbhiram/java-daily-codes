import java.util.Scanner;

 class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        if (m>=10 && m<=1000 && n>=10 && n<=1000) 
        {
            boolean result = isBigger(m,n);
            System.out.println(result);
        } 
        else 
        {
            System.out.println("Invalid Input");
        }
    }
    public static boolean isBigger(int m, int n) 
    {
        return m>n;
    }
}
