import java.util.Scanner;

public class Main
{
    int[] arr;
    
    public Int1(int[] arr)
    {
        this.arr=arr;
    }
    
    public int sum()
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public int mul()
    {
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {
            mul=mul*arr[i];
        }
        return mul;
    }

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int r=input.nextInt();
        if(r<=0)
        {
            System.out.println("Invalid");
        }
        else
        {
            int[] arr=new int[r];
            for(int i=0;i<r;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            Int1 a=new Int1(arr);
            
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println(a.sum());
            }
            else if(choice==2)
            {
                System.out.println(a.mul());
            }
            else
            {
                System.out.println("Wrong Choice");
            }
        }
    } 
}
