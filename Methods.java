class Methods{
    static void Details(String name){
        System.out.println("Welcome "+ name);
    }
    static void Details2(String name,int roll){
        System.out.println("Welcome "+name);
        System.out.println("Your roll number is "+roll);
    }
    public static void main(String[] args){
        Details("Mitali");
        Details2("Ashu",158);
    }
}