import java.util.Scanner;

 class Main 
{
    public static void main(String[] args) 
    {
        Scanner sai= new Scanner(System.in);
        int n;
        n=sai.nextInt();
        int[] deck1 = new int[n];
        int[] deck2 = new int[n];

        for (int i=0;i<n;i++) 
        {
            int m=obj.nextInt();
            deck1[i]=m;
            deck2[i]=m;
        }

        for (int i=0;i<n;i++) 
        {
            System.out.print(deck1[i] + " ");
        }
        System.out.println();

        for (int i=0;i<n;i++) 
        {
            System.out.print(deck2[i] + " ");
        }
    }
}
