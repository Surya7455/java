class Computer{
    public void playMusic()
    {
        System.out.println(" Music Playing..");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
        return "Pen";

        else
        return "Nothing";
    }
}

public class Method{
    public static void main(String a[]){

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(12);
        System.out.println(str);
        
    }
}