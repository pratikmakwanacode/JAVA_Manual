class P16
{

    void calculateEMI(int p, int t, float r)
    {
        float emi = (p * r * t) / 100;
        System.out.println("Home Loan EMI = " + emi);
    }
    void calculateEMI(double p, int t, double r)
    {
        double emi = (p * r * t) / 100;
        System.out.println("Vehicle Loan EMI = " + emi);
    }
    void calculateEMI(int p, int t)
    {
        double emi = (p * 10 * t) / 100;
        System.out.println("Personal Loan EMI = " + emi);
    }

    public static void main(String args[])
    {
        P16 l = new P16();

        l.calculateEMI(500000, 5, 8.5f);
        l.calculateEMI(200000, 3, 9.0);
        l.calculateEMI(100000, 2);
    }
}
