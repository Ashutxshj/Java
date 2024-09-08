interface Fruits{
    public abstract void taste();
    public void eat();
}
class Mango implements Fruits{
    public void taste(){
        System.out.println("Mango is sweet.");
    }
    public void eat(){
        System.out.println("Let's eat Fruits.");
    }
}
class Interfaced{
    public static void main(String[] args){
        Mango m = new Mango();
        m.eat();
        m.taste();
    }
}