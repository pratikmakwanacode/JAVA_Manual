import java.util.Scanner;

class P7
{
    public static void main(String args[])
    {  

        double a, b, c, s, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side a:");
        a = sc.nextDouble();

        System.out.println("Enter side b:");
        b = sc.nextDouble();

        System.out.println("Enter side c:");
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a)
        {
            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of triangle = " + area);
        }
        else
        {
            System.out.println("Triangle is not possible");
        }
    }
}
