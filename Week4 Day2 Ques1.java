import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner abhi= new Scanner(System.in);
        int size = abhi.nextInt();

        if (size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }
        double[] doubleArray = new double[size];
        for (int i = 0; i < size; i++) {
            doubleArray[i] = obj.nextDouble();
        }

        int[] intArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (doubleArray[i] < 0) {
                System.out.println("Invalid Array Elements");
                return;
            }
            intArray[i] = (int) doubleArray[i];
        }

        for (int i = 0; i < size; i++) {
            System.out.println(intArray[i]);
        }
    }
}
