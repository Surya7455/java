import java.util.ArrayList;
import java.util.Collection;
import javax.xml.transform.Source;

public class Api
{
    public static void main(String a[])
    {
        //Collection<Integer> nums = new ArrayList<Integer> ();
        List<Integer> nums = new ArrayList<Integer> ();
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(0);
        /*for (int n: nums )
        {
            int num = (Integer)n;
            System.out.println(n);
        }*/
        System.out.println(nums.get(2));
    }
}   