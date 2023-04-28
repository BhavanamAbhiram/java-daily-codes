import java.util.Scanner;

 class Main 
{
    private double r;
    public Circle(double r) 
    {
        this.r = r;
    }
    public double getArea() 
    {
        return 3.14*r*r;
    }
    public static void main(String[] args) 
    {
        Scanner sai =new Scanner(System.in);
        int n = sai.nextInt();

        Circle[] circles =new Circle[n];

        for (int i=0;i<n;i++) 
        {
            double r = sai.nextDouble();
            circles[i] = new Circle(r);
        }
        for (int i=0;i<n;i++) 
        {
            double a = circles[i].getArea();
            if (a>30.0) 
            {
                System.out.format("%.4f",a);
            }
        }
    }
}
