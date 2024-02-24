@Deprecated
class A
{
    public void showthedatawhichBelongsToThisClass()
    {
        System.out.println("A SHOW");
    }
}
class B extends A
{
    @Override
    public void showthedatawhichBelongsToThisClass()
    {
        System.out.println("B SHOW");
    }
}
public class Ann
{
    public static void main(String a[])
    {
        B obj =new B();
        obj.showthedatawhichBelongsToThisClass();
    }
}