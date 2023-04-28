
import java.util.Scanner;

 class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a>1)
        {
            int count = 0;
            int arr[] = new int[a];
            for (int i=0;i<a;i++)
            {
                arr[i] = sc.nextInt();
            }
             for (int i=0;i<a;i++)
            {
                 if (arr[i]>25)
                     count++;
            }
            System.out.println(count);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
