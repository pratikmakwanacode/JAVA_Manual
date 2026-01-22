import java.util.Scanner;

class P9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);
        System.out.println("Sum = " + sum);
    }
}
