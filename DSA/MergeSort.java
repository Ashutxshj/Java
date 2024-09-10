public class MergeSort{
    public static void main(String[] args){
       //! O(n log n)
       //! Space: O(n)

       int[] arr={8,2,5,3,4,7,6,1};
       mergesort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
       }
    }
    private static void mergesort(int[] arr){
        int len=arr.length;
        if (len<=1) return;

        int mid=len/2;
        int[] leftArray=new int[mid];
        int[] rightArray=new int[len-mid];

        int i=0; //left array
        int j=0; //right array

        for(;i<len;i++){
            if(i<mid){
                leftArray[i]=arr[i];
            }
            else{
                rightArray[j]=arr[i];
                j++;
        }
    }
    mergesort(leftArray);
    mergesort(rightArray);
    merge(leftArray,rightArray,arr);
}
    private static void merge(int[] leftArray,int[] rightArray,int[] array){
        int lsize=array.length/2;
        int rsize=array.length-lsize;
        int i=0,l=0,r=0;

        //check conditions for merging
        while(l<lsize && r<rsize){
            if(leftArray[l]<rightArray[r]){
                array[i]=leftArray[l];
               i++;
               l++; 
            }
            else{
                array[i]=rightArray[r];
                i++;
                r++;
            }
        }
        while(l<lsize){
            array[i]=leftArray[l];
            i++;
            l++;
        }
        while(r<rsize){
            array[i]=rightArray[r];
            i++;
            r++;
        }
    }
}