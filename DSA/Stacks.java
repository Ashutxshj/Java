import java.util.Stack;

public class Stacks{
    public static void main(String[] args){
        //stack = Last-In First-Out
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Doom");
        stack.push("FFVII");
        stack.push("Tekken 7");

        System.out.println(stack.empty());

        stack.pop(); //Removes top most element
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println(myFavGame);


        System.out.println(stack.peek());//TopMost element in Stack

        System.out.println(stack.search("Doom")); //if not returns -1

        // for(int i=0;i<1000000;i++){
        //     stack.push("Fallout76");
        // }
        //? Runs out of Memory...due Java Heap

        //! BackTracking Algorithmns(DFS,Solving Puzzles)
        System.out.println(stack.size()
        );
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Stack size: " + stack.size());
    }
}