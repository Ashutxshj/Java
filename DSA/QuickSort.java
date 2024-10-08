class QuickSort{
    public static void main(String[] args){
        //! O(N log N) :- Best Case
        //! O(N^2) :- Worst Case(if already sorted)

        //! Space Complexity:- O(log N)
       int[] arr={8,2,5,3,4,7,6,1};
       quickSort(arr,0,arr.length-1);
       for(int i:arr){
        System.out.print(i+" ");
       }
    }
    private static void quickSort(int[] array,int start,int end){
        if(end<=start) return;
        int pivot = partition(array,start,end);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1,end);
    }
    private static int partition(int[] array,int start,int end){
        int pivot=array[end];
        int i=start-1;
        for(int j=start;j<=end-1;j++){
            if(array[j]<pivot){
                i++;
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp=array[i];
        array[i]=array[end];
        array[end]=temp;
        return i;
        
    }
}