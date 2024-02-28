class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }
    public void setname( String n)
    {
        name = n;
    }
}

public class Encp
{
    public static void main(String a[])
{
    Human obj = new Human();
    obj.setAge(99);
    obj.setname("Kunal");

    System.out.println(obj.getName() + " : " + obj.getAge());
}
}