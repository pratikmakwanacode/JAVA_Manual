import java.util.Scanner;

class P3
{
    public static void main(String args[])
    {
   

        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.println("Enter a single letter:");
        ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
        {
            ch = (char)(ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
