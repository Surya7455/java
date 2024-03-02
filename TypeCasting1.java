class A 
{
    public void show1()
    {
        System.out.println("A SHOW");
    }
}
class B extends A 
{
    public void show2()
    {
        System.out.println("B SHOW");
    }
}
public class TypeCasting
{
    public static void main(String a[])
    {
        A obj = (A) new B();
        obj.show1();  // Upcasting


        B obj1 = (B) obj;
        obj1.show2();    //Downcasting


        // Wrapper Class
         int num = 4;
         int num1 = num;  // Autoboxing

         int num2  = num1; //Auto-unboxing
         System.out.println(num2);
    }
}