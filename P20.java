import java.util.Scanner;

class P20
{
    static boolean isValidPassword(String p)
    {
        int count = 0;

        if(p.length() < 8)
            return false;

        for(int i = 0; i < p.length(); i++)
        {
            char ch = p.charAt(i);

            if(!Character.isLetterOrDigit(ch))
                return false;

            if(Character.isDigit(ch))
                count++;
        }

        if(count >= 2)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(isValidPassword(pass))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}