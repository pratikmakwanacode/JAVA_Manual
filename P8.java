import java.util.Scanner;

class P8
{
    public static void main(String args[])
    {  

        if (args.length < 2)
        {
            System.out.println("Please enter two numbers");
        }
        else
        {
            int a, b, sum;

            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);

            sum = a + b;

            System.out.println("Sum = " + sum);
        }
    }
} 