import java.util.Scanner;

class P4
{
    public static void main(String args[])
    {
      float h,w,bmi;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in inches:");
        h = sc.nextFloat();


        System.out.println("Enter weight in pounds:");
        w = sc.nextFloat();
      
        h*= 0.0254;
        w*= 0.45359237;
        bmi = w / (h * h);

        System.out.println("BMI = " + bmi);
    }
}
