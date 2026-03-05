class P18
{
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    P18(String name, double bal)
    {
        account_holder_name = name;
        balance = bal;
    }

    void calculateInterest()
    {
        double interest = (balance * interest_rate) / 100;
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Interest Earned: " + interest);
    }

    static void updateInterestRate(double rate)
    {
        interest_rate = rate;
    }

    public static void main(String args[])
    {
        P18 a1 = new P18("Pratik", 10000);
        P18 a2 = new P18("Rahul", 20000);

        a1.calculateInterest();
        a2.calculateInterest();

        P18.updateInterestRate(6.5);

        System.out.println("After Updating Interest Rate");

        a1.calculateInterest();
        a2.calculateInterest();
    }
}