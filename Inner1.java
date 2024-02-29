class A 
{ 
   int age;
   public void show()
   {
    System.out.println("SHOW");

   }
   static class B 
   {
    public void confir()
    {
        System.out.println("CONFIR");
    }
   }

   public class Inner
   {
    public static void main(String a[])
    {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.confir();

    }
   }
}