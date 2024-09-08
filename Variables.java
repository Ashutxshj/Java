public class Variables{
    public void localVariable(){
        String name="Ashu";
        int marks = 100;
        System.out.println(name+ " Scored "+ marks+"%.");
    }

    public static void main (String[] args //Args is sequence of arguments or array
    ){
        Variables vt = new Variables();
        vt.localVariable();
    }
}