public class VariableInstance{
    public String name="Ashu";
    public int marks=100; //Inside class Outside Method
    public static String bitch="Please";

    public void instanceVariable(){
        System.out.println(name + " Scored " + marks +"%.");
    }

    public static void main(String[] args){
        VariableInstance vt = new VariableInstance();
        vt.instanceVariable();
    }
}