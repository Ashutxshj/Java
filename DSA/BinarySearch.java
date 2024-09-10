import java.util.Arrays;
public class BinarySearch{
    //Find position of a target in sorted array
    //Eliminate half of array during each step
    public static void main(String[] args){
        int array[] = new int[1000000];
        int target = 777;

        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        int index=Arrays.binarySearch(array,target);

        if(index==-1){
            System.out.println(target+" not found");
        }
        else{
            System.out.println(target+" found at: "+index);
        }
    }
    private static int binarySearch(int[] array,int target){
        int low=0;
        int high=array.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int value=array[mid];

            System.out.println("middle: "+value);


            if(value<target){
                low=mid+1;
            }
            else if(value>target){
                high=mid-1;
            }
            else return mid; //target found
        }
        return -1;
    }
}