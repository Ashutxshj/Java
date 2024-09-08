class ArithmeticOperations{
    int a,b;

    ArithmeticOperations(int a,int b){
        this.a=a;
        this.b=b;
    }
    void add(){
        System.out.println("Sum: "+(a+b));
    }
    void subtract(){
        System.out.println("Difference: "+(a-b));
    }
    void mutliply(){
        System.out.println("Product: "+(a*b));
    }
    void divide(){
        if(b!=0)
            System.out.println("Quotient: "+(a/b));
        else
            System.out.println("Division by zero is not allowed");
    }
}

public class ArthimeticOps{
    public static void main(String[] args){
        ArithmeticOperations op = new ArithmeticOperations(10,5);
        op.add();
        op.subtract();
        op.mutliply();
        op.divide();
    }
}