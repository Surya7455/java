import java.io.IOException;
import java.io.InputStreamReader;

public class InputBuffer
{
    public static void main(String a[]) throws IOException 
    {
       /* System.out.println("Enter the number ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferReader bf = new BufferedReader(in);

        int num = Integer.parsInt(bf.readline());
        System.out.println(num); */

        int num = 0;
        BufferedReader br = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            int num = Integer.parsInt(bf.readline());
            System.out.println(num);
        }
    }
}