class A 
{
    public void show()
    {
        System.out.println("IN SHOW");
    }
    public void confir()
    {
        System.out.println("IN CONFIR");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("IN B SHOW");
    }
}
public class MeOver
{
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
        obj.confir();
    }
}