// Object Oriented Programming
// Object - Properties and Behaviours
// Class


// Class Start
class Calculator{ 
    int a; //  Variable


    // Method Start
    public int add(int n1, int n2){
        int r= n1 + n2;
        return r;
    }
    //Method End
}
// Class End

public class Object{

    public static void main(String a[]){
        int num1 =2;
        int num2=5;

        Calculator calc= new Calculator();
        int result = calc.add(num1,num2);
        



        //int result = num1 + num2;
        System.out.println(result);
    }
}