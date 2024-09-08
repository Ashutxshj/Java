class Example{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age= newAge;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        Example ex6 = new Example();
        ex6.setName("Ashutosh");
        ex6.setAge(20);
        System.out.println("Name: "+ex6.getName());
        System.out.println("Age: "+ex6.getAge());
    }
}