import java.util.Scanner;

class Employee {
    String name;
    double salary;
}

class P10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter employee name: ");
        emp.name = sc.nextLine();

        System.out.print("Enter employee salary: ");
        emp.salary = sc.nextDouble();

        System.out.println("Employee Name = " + emp.name);
        System.out.println("Employee Salary = " + emp.salary);
    }
}
