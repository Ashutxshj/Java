public class LinearSearch{
    public static void main(String[] args){
        //* Iterate through a collection one element at a time

        //* Disadvantage:
        //Slow for large datasets

        //* Advantages:
        // Fast for small-medium searches
        //No need for sorting
        //DS with no random access(LinkedList)

        int[] arr={9,3,2,7,4,6,1};
        int index=LinearSearch(arr,1);
        if(index!=-1){
            System.out.println("Element found at index: "+index);
        }
        else{
            System.out.println("Element not found");
        }

}
private static int LinearSearch(int [] array,int value){
    for(int i=0;i<array.length;i++){
        if(array[i]==value){
            return i;
        }
    }
    return -1;
}
}