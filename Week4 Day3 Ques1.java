import java.util.Arrays;
import java.util.Scanner;

 class Main
{
    public static void main(String[] args) 
    {
        Scanner sukanya = new Scanner(System.in);
        
        int size = sukanya.nextInt();
        if (size <= 0) 
        {
            System.out.println("Invalid Array Size");
            return;
        }
        int[] arr = new int[size];
        for (int i=0;i<size;i++) 
        {      
             arr[i] = sukanya.nextInt();
            if (arr[i] < 0) 
            {
                System.out.println("Invalid Array Elements");
                return;
            }
        }     
        Arrays.sort(arr);
        int s = arr[size-2];
        System.out.println(s);
    }
}
