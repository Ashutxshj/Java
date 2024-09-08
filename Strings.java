class Strings{
    public static void main(String[] args){
        String name = "Ashu";
        System.out.println("My name is "+ name);

        char[] name2 = {'A','S','H','U'};
        String welcomeMsg = new String(name2);
        System.out.println("Welcome "+welcomeMsg);

        System.out.println(name +" Weds "+ welcomeMsg);
        int quantity = 100;
        System.out.println(quantity+" "+name);
    }
}