class P21
{
    void calculateVolume(int side)
    {
        int volume = side * side * side;
        System.out.println("Volume of Cube = " + volume);
    }

    void calculateVolume(int l, int w, int h)
    {
        int volume = l * w * h;
        System.out.println("Volume of Rectangular Cube = " + volume);
    }

    void calculateVolume(double r)
    {
        double volume = (4.0/3) * 3.14 * r * r * r;
        System.out.println("Volume of Sphere = " + volume);
    }

    public static void main(String args[])
    {
        P21 v = new P21();

        v.calculateVolume(3);
        v.calculateVolume(4,5,6);
        v.calculateVolume(2.5);
    }
}