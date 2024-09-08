import java.util.LinkedHashSet;
import java.util.Set;

public class Mishra {
    public static void main(String[] args) {
        // Create a LinkedHashSet instance
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        
        // Display the elements
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // Remove an element
        linkedHashSet.remove("Banana");
        
        // Check if an element exists
        boolean containsCherry = linkedHashSet.contains("Cherry");
        System.out.println("Contains Cherry: " + containsCherry);
        
        // Iterate over the elements
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
        
        // Get the size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);
        
        // Clear all elements
        linkedHashSet.clear();
        
        // Check if the LinkedHashSet is empty
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("Is LinkedHashSet empty: " + isEmpty);
    }
}