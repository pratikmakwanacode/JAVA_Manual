class P13 {
    public static void main(String[] args) {

        double w1 = 4, h1 = 40;
        double w2 = 3.5, h2 = 35.9;

        double a1 = w1 * h1;
        double p1 = 2 * (w1 + h1);

        double a2 = w2 * h2;
        double p2 = 2 * (w2 + h2);

        System.out.println("Rectangle 1 Area = " + a1);
        System.out.println("Rectangle 1 Perimeter = " + p1);

        System.out.println("Rectangle 2 Area = " + a2);
        System.out.println("Rectangle 2 Perimeter = " + p2);

        if (a1 > a2)
            System.out.println("Rectangle 1 has larger area");
        else
            System.out.println("Rectangle 2 has larger area");
    }
}
