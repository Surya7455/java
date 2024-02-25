public class Array{
    public static void main(String a[]){
        int num1[] = {9,8,7,6};
        num1[1] = 5;   //Change the value at loaction 1
        // System.out.println(num1[0]);
        for(int i=0; i<4; i++)
        {
            System.out.println(num1[i]);
        }   

        // 2-D Array
        int num[][] = new  int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(num[i][j] + "  ");
            }
            System.out.println();
        }
    }
}