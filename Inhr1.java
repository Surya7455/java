

public class Inhr
{
    public static void main(String a[])
    {
        Calc obj = new Calc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(10,9);
        int r3 = obj.multi(4,4);
        int r4 = obj.div(20,4);

        System.out.println(r1 + "  " + r2 +  "  " + r3 + "  " + r4);
    }
}

