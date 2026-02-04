class P14
{
    String id, name;
    double bal;

    void assign(String i, String n, double b)
    {
        id = i;
        name = n;
        bal = b;
    }

    void show()
    {
        System.out.println(id + " " + name + " " + bal);
    }

    public static void main(String args[])
    {
        P14 acc[] = new P14[3];

        for(int i=0;i<3;i++)
            acc[i] = new P14();

        acc[0].assign("A1","Rahul",5000);
        acc[1].assign("A2","Neha",8000);
        acc[2].assign("A3","Amit",10000);

        System.out.println("All Accounts:");
        for(int i=0;i<3;i++)
            acc[i].show();

        System.out.println("Search Result:");
        for(int i=0;i<3;i++)
            if(acc[i].id.equals("A2"))
                acc[i].show();
    }
}
