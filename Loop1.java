public class Loop {
    public static void main(String[] args) {
        int i = 1;
        while (i<4)
        {
            System.out.println("Hi " + i);
            i++;
        }
        System.out.println("BYE " + i);

        int j =5;
        do{
            System.out.println("Hi! " + j);
            j++;
        }while(j<=4);  

        for(int k=1; k<=3; k++){
            System.out.println("Hello " + k);
        }

        for(int m=8; m>=3; m--){
            System.out.println("Hello! " + m);
        }

    }
}
