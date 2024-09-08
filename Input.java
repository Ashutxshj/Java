import java.util.Scanner;
class Input{
    public static void main(String[] args){
        /*
         * Reading keyboard input
         * Scanner sc = new Scanner(System.in)
         * 
         * Reading String input
         * Scanner sc = new Scanner(String str)
         * 
         * Reading input stream
         * Scanner sc = new Scanner(InputStream input)
         * 
         * Scanner sc = new Scanner(File file)
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name, RollNo,Marks,Grade");

        String name=sc.nextLine();
        int Rollno=sc.nextInt();
        double Marks=sc.nextDouble();
        char Grade = sc.next().charAt(0); //used to read till space 
        
        System.out.println("Name: "+name);
        System.out.println("Gender: "+Rollno);
        System.out.println("Marks: "+Marks);
        System.out.println("Grade: "+Grade);

        sc.close();
    }
}