import java.util.Scanner;

class P19
{
    String collegeName;

    P19(String name)
    {
        collegeName = name;
    }

    class Admission
    {
        String studentName;
        String course;

        void accept()
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void display()
        {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String args[])
    {
        P19 c = new P19("ABC College");

        P19.Admission a = c.new Admission();

        a.accept();
        a.display();
    }
}