//? Build a console-based to-do list where users can add, remove, and view tasks.
import java.util.*;
import java.io.*;
class functions{
    void addTask(Vector<String> l){
        l.insert(sc.nextString());
        System.out.println("Task Added!");
    }
    void removeTask(Vector<String> l){
        l.remove(sc.nextString());
        System.out.println("Task Removed!");
    }
    void viewTask(Vector<String> l){
        for(String i=0;i<l.size();l++){
            System.out.println(l[i]+" ");;
        }
    }
}
public class ToDoList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------WELCOME TO ASHU's TODO LIST---------------------------------------------");
        Vector<String> list = new Vector<String>();
        System.out.println("What do you want to do? ");
        System.out.println("1)Add Task\n2) Remove Tasks\n3) View Tasks");
        functions fc = new functions();
        switch(sc.nextInt()){
            case 1:
            fc.addTask(list);
            break;
            case 2:
            fc.removeTask(list);
            break;
            case 3:
            fc.viewTask(list);
            break;
            default:
            System.out.println("Invalid Input");
            break;
        }
        System.out.println("------------------------------------------------THE END-------------------------------------------------------------------------------------------------------------");
    }
}