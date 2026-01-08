import java.util.Scanner;

class P2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double a,b,c,d,e,f;
        double D,Dx,Dy,x,y;

        System.out.println("Enter a:");
        a = sc.nextDouble();

        System.out.println("Enter b:");
        b = sc.nextDouble();

        System.out.println("Enter c:");
        c = sc.nextDouble();

        System.out.println("Enter d:");
        d = sc.nextDouble();

        System.out.println("Enter e:");
        e = sc.nextDouble();

        System.out.println("Enter f:");
        f = sc.nextDouble();

        D  = a*d - b*c;
        Dx = e*d - b*f;
        Dy = a*f - e*c;

        if(D == 0)
        {
            System.out.println("No solution");
        }
        else
        {
            x = Dx / D;
            y = Dy / D;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
