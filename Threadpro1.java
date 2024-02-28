class A extends Thread
{
    public void run()
    {
        for(int i=0; i<=100; i++)
        {
            System.out.println("HI");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0; i<=100; i++)
        {
            System.out.println("HELLO");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

            
        }
    }
}
public class Threadspro
{
    public static void main(String a[])
    {
        A obj1 = new A();
        B obj2 = new B();
        //System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try{
                Thread.sleep(2);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        obj2.start();
    }
}