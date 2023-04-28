import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] h = new int[10]; 
        for (int i=0;i<10;i++) 
        {
            h[i] = input.nextInt();
        }
        for (int i=0;i<9;i++) 
        {
            for (int j=0;j<9-i;j++) 
            {
                if (h[j] > h[j+1]) 
                {
                    int temp = h[j];
                    h[j] = h[j+1];
                    h[j+1] = temp;
                }
            }
        }
        for (int i=0;i<10;i++) 
        {
            System.out.print(h[i] + " ");
        }
    }
}
