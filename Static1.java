class Mobile
{
    String brand;
    int price;
    static String name;

    public Mobile()
    {
        brand = " ";
        price =200;
        System.out.println("In Constructor");
    }

    static
    {
        name ="Phone";
        System.out.println("In Static block");
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1()
    {
        System.out.println(name);
    } 

    public static void show2(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Static
{
    public static void main(String a[])
    {
        Mobile obj1 =new Mobile();
        obj1.brand ="Apple";
        obj1.price = 20000;
        // obj1.name = "SmartPhone";
        Mobile.name = "SmartPhone";

        Mobile obj2 =new Mobile();
        obj2.brand ="Samsang";
        obj2.price = 23000;
        // obj2.name = "SmartPhone";
        Mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();
        Mobile.show1();
        Mobile.show2(obj1);

    }
}
