import java.util.Scanner;

class P1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double m, f;

        System.out.println("Enter meters:");
        m = sc.nextDouble();

        f = m * 3.28;

        System.out.println("Feet = " + f);
    }
}
