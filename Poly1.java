/*class Computer
{

}

class Laptop
{

} */
class A 
{
    public void show()
    {
        System.out.println("SHOW");
    }
}

class B extends A
{

}
public class Poly
{
    public static void main(String a[])
    {
        A obj = new B();
        obj.show();

        // FINAL VARIBLE
        final int num = 8;
       // num =9 ; [IN FINAL VARIBLE YOU CANNOT CHANGE THE VALUE OF THE VARIABLE]
        System.out.println(num);
    } 
}