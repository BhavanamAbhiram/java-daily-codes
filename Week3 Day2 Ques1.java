import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner abhi Scanner(System.in);
        int m=0,c=0;
        int n=0;
        String a=abhi.next();
        String b=abhi.next();
        if(a.length()!=b.length())
        {
            System.out.println("Not Similar");
            System.exit(0);
        }
        else if(a.length()<b.length())
        {
            n=b.length();
        }
        else
        {
            n=a.length();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    m++;
                }
            }
        }
        for(int i=0;i<(n/2);i++)
        {
            for(int j=(n-1);j>=(n/2);j--)
            {
                if(a.charAt(i)==b.charAt(j))
                {
                    c++;
                }
            }
        }
        if((m-c)==n)
        {
            System.out.println("Similar");
        }
        else
        {
            System.out.println("Not Similar");
        }
    }
}
