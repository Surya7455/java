interface Computer
{
     void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("CODE, COMPILE, RUN");
    }
}
class Desktop implements Computer 
{
    public void code()
    {
        System.out.println("CODE, COMPILE, RUN: FAST");
    }
}
class Developer
{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class Interface
{
    public static void main(String a[])
    {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer navin = new Developer();
        navin.devApp(desk);
    }
}