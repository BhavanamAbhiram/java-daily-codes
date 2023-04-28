import java.util.Scanner;
import java.util.Arrays;

class Main
{
    public static double[] avg_marks(double[][] marks) 
    {
        int n = marks.length; 
        double[] avgs = new double[n];

        for (int i=0;i<n;i++) 
        {
            Arrays.sort(marks[i], 0, 3);
            double sum = marks[i][1] + marks[i][2]; 
            avgs[i] = sum/2; 
        }
        return avgs;
    }
    public static void main(String[] args) 
    {
        double[][] marks =
        {
            {10.5, 2.5, 15},
            {5.25, 6.75, 11.25}
        };
        double[] avgs = avg_marks(marks);

        for (double avg : avgs) 
        {
            System.out.print(avg + " ");
        }
    }
}
