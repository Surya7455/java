enum Status{
    Running, Failed, Success;
}
public class Enum
{
    public static void main(String a[])
    {
        
        //Status s = Status.Running;
        //System.out.println(s);
        Status[] ss = Status.values(); //For All Values
        for(Status s:ss)
        { 
            System.out.println(s);
        }
    }
}     