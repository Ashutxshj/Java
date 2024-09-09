import java.util.*;
class Functions {
    Scanner sc = new Scanner(System.in);
    void addTask(Vector<String> l) {
        System.out.println("Enter task to add: ");
        String task = sc.nextLine();
        l.add(task);
        System.out.println("Task Added!");
    }
    void removeTask(Vector<String> l) {
        System.out.println("Enter task to remove: ");
        String task = sc.nextLine();
        if (l.contains(task)) {
            l.remove(task);
            System.out.println("Task Removed!");
        } else {
            System.out.println("Task not found.");
        }
    }
    void viewTasks(Vector<String> l) {
        if (l.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Your tasks:");
            for (int i = 0; i < l.size(); i++) {
                System.out.println((i + 1) + ". " + l.get(i));
            }
        }
    }
}

public class ToDoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions fc = new Functions();
        Vector<String> list = new Vector<String>();
        
        while (true) {
            System.out.println("------------------------------------------------------WELCOME TO ASHU's TODO LIST---------------------------------------------");
            System.out.println("What do you want to do? ");
            System.out.println("1) Add Task\n2) Remove Task\n3) View Tasks\n4) Exit");
            
            int choice = sc.nextInt();
            sc.nextLine(); // consume the leftover newline
            
            switch (choice) {
                case 1:
                    fc.addTask(list);
                    break;
                case 2:
                    fc.removeTask(list);
                    break;
                case 3:
                    fc.viewTasks(list);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
