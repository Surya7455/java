class MyException extends Exception
{
    public MyException(String string)
    {
        super(string);
    }
}
public class Excp
{
    public static void main(String a[])
    {
        int i =2;
        int j =0;
       // int num[] = new int[5];
        //String str = null;

     try 
     {
        j = 18/i;
       /* System.out.println(str.length());
        System.out.println(num[1]);
        System.out.println(num[2]); */
        if (j==0)
        {
            throw new MyException("I don't known");
        }
    }
    catch (MyException e)
    {
        System.out.println("Cannot Divide By Zero(0)");
    }
    catch (ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Cannot Divide By Zero(0)");
    }
    catch (Exception e)
    {
        System.out.println("Something Went Worng");
    }
    System.out.println(j);
    System.out.println("Bye"); 
    
      
    }
}