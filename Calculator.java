import java.util.*;
class Calculator{
    public static void main(String[] args){
        System.out.println("--------------------------------------WELCOME TO ASHU's CALCULATOR-------------------------------------------------");
        System.out.println("Give Two Numbers: ");
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("What would you like to do?: ");
        System.out.println("1)Addition\n2)Subtraction\n3)Multiplication\n4)Division\n");
        int input=sc.nextInt();
        switch(input){
            case 1:
                System.out.println("The Addition of "+a+" and "+b+" gives us"+(a+b));
            break;
            case 2:
                System.out.println("The Subtraction of "+a+" and "+b+"gives us "+(a-b));
            break;
            case 3:
                System.out.println("The Multiplication of "+a+" and "+b+" gives us "+(a*b));
            break;
            case 4:
                if(b!=0){
                System.out.println("The Division of "+a+" and "+b+" gives us "+(a/b));
                }
                else{
                    System.out.println("Denominator can't be zero");
                }
            break;
            default:
            System.out.println("Invalid Input");
            break;
        }
    }
}