import java.util.Scanner;

class P5
{
    public static void main(String args[])
    {  

        int amt, a, b, c, d, e, f;

        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter amount:");
        amt = sc.nextInt();

        a = amt / 100;
        amt = amt % 100;

        b = amt / 50;
        amt = amt % 50;

        c = amt / 10;
        amt = amt % 10;

        d = amt / 5;
        amt = amt % 5;

        e = amt / 2;
        amt = amt % 2;

        f = amt;

        System.out.println("100 = " + a);
        System.out.println("50  = " + b);
        System.out.println("10  = " + c);
        System.out.println("5   = " + d);
        System.out.println("2   = " + e);
        System.out.println("1   = " + f);
    }
}
