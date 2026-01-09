import java.util.Scanner;

class P6
{
    public static void main(String args[])
    {  
         
        int n, d1, d2, d3, d4, d5;
        int r1, r2, r3, r4, r5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a five digit number:");
        n = sc.nextInt();

        d5 = n % 10;
        n = n / 10;

        d4 = n % 10;
        n = n / 10;

        d3 = n % 10;
        n = n / 10;

        d2 = n % 10;
        n = n / 10;

        d1 = n % 10;

        r1 = (d1 + 1) % 10;
        r2 = (d2 + 1) % 10;
        r3 = (d3 + 1) % 10;
        r4 = (d4 + 1) % 10;
        r5 = (d5 + 1) % 10;

        System.out.println("New number = " + r1 + r2 + r3 + r4 + r5);
    }
}
