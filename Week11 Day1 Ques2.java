import java.util.Scanner;

 class Main 
{

    static class Cal
    {
        public static int add(int a, int b) 
        {
            return a+b;
        }
        public static int sub(int a, int b) 
        {
            return a-b;
        }
        public static int mul(int a, int b) 
        {
            return a*b;
        }

        public static int div(int a, int b) 
        {
            return a/b;
        }
    }

    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        String operator = input.next();

        int result;

        switch(operator) 
        {
            case "+":
                result = Cal.add(a,b);
                break;
            case "-":
                result = Cal.sub(a,b);
                break;
            case "*":
                result = Cal.mul(a,b);
                break;
            case "/":
                result = Cal.div(a,b);
                break;
            default:
                System.out.println("invalid operator");
                return;
        }
        System.out.println(result);
    }
}
