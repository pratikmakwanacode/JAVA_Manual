class P15
{
    void generateBill(int total)
    {
        System.out.println("Final Bill = " + total);
    }

    void generateBill(int total, int discount)
    {
        System.out.println("Final Bill = " + (total - discount));
    }

    void generateBill(int total, double percent)
    {
        double bill = total - (total * percent / 100);
        System.out.println("Final Bill = " + bill);
    }

    public static void main(String args[])
    {
        P15 b = new P15();

        b.generateBill(4000);
        b.generateBill(4000, 500);
        b.generateBill(4000, 10.0);
    }
}
