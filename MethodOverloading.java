class MethodOverloading{
    static void Details(String name,int marks){
        System.out.println("Welcome "+name);
        System.out.println("You got "+marks+" marks in exam.");
    }
    static void Details(String name,double marks){
        System.out.println("Welcome "+name);
        System.out.println("You got "+marks+" marks in exam.");
    }
    public static void main(String[] args){
        Details("Ashu",95);
        Details("Ashutosh",78);
    }
}