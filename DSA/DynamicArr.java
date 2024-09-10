import java.util.*;
import java.util.ArrayList;
public class DynamicArr{
/*
 * Key Operations Explained

! Add Elements:
dynamicArray.add(element): Adds an element to the end of the dynamic array.
dynamicArray.add(index, element): Inserts an element at a specific index.

! Remove Elements:
dynamicArray.remove(index): Removes the element at the specified index.
dynamicArray.remove(Object element): Removes the first occurrence of the specified element.

! Get Element:
dynamicArray.get(index): Retrieves the element at the specified index.

! Set Element:
dynamicArray.set(index, element): Updates the element at the specified index.

! Size:
dynamicArray.size(): Returns the current number of elements in the dynamic array.

! Clear:
dynamicArray.clear(): Removes all elements from the array.

! Check if Empty:
dynamicArray.isEmpty(): Returns true if the array has no elements.

! Check if Contains:
dynamicArray.contains(element): Returns true if the array contains the specified element.
     */
    int size;
    int capacity=10;
    Object[] array;

    public DynamicArr(){
        this.array=new Object[capacity];
    }
    public DynamicArr(int capacity){
        this.capacity=capacity;
        this.array=new Object[capacity];
    }
    public void add(Object data){

    }
    public void insert(int index,Object data){
    }
    
    public static void main(String[] args){
        // Java = ArrayList
        // C++  = Vector
        // JavaScript = Array
        // Python = List
        
        //TODO ArrayList<String> arr=new ArrayList<String>();

        DynamicArr d = new DynamicArr(10);
    System.out.println(d.capacity);

    }
}