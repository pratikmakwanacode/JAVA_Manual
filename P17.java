class University
{
    static int totalStudents;
    static String universityName;

    static
    {
        universityName = "GTU";
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
        totalStudents++;
    }

    static int getTotalStudents()
    {
        return totalStudents;
    }
}

class P17
{
    public static void main(String args[])
    {
        University s1 = new University();
        University s2 = new University();
        University s3 = new University();

        System.out.println("University Name = " + University.universityName);
        System.out.println("Total Students = " + University.getTotalStudents());
    }
}