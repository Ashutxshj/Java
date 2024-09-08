class AddMethods{
    static int AddNums(int a,int b){
        return (a+b);
    }

    static int AddNums(int a,int b,int c){
        return (a+b+c);
    }
    
    static double AddNums(double a,double b){
        return (a+b);
    }
}
class Polymorphism{
    public static void main(String[] args){
        System.out.println(AddMethods.AddNums(10,20));
        System.out.println(AddMethods.AddNums(10,20,30));
        System.out.println(AddMethods.AddNums(10.2,20.3));
    }
    /*
     * Compile time polymorphism
     * Run time polymorphism
     */
}