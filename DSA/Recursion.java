public class Recursion{
    public static void main(String[] args){
        //Iteration = Repetition of a process
        //Recursion = Repetition of a procedure 
        walk1(5);
        System.out.println(" ");
        walk2(5);
        System.out.println(factorial(4));
    }
    private static void walk1(int steps){
       for(int i=0;i<steps;i++){
        System.out.println("You take a step");
       }
    }
    private static void walk2(int steps){
        if(steps<1) return;
        System.out.println("You take a step!");
        walk2(steps-1);
    }

    //! Call Stack

    private static int factorial(int num){
        if(num<1) return 1;
        return num*factorial(num-1);
    }
}