public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = new int[]{4,3,2,10,12,1,5,6};
        int[] arr = new int[]{7,2,1,6,8,5,3,4};
        sort(arr,0,arr.length-1);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    private static void sort(int[] arr, int start, int end) {
        if(start < end){
            int partitionIndex = partition(arr,start,end);
            sort(arr,start,partitionIndex-1);
            sort(arr,partitionIndex+1,end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot= arr[end];
        int partionIndex = start;
        //<end means end wont be considered
        for(int i=start; i<end; i++){
            if(arr[i] <= pivot){
                int temp= arr[partionIndex];
                arr[partionIndex]=arr[i];
                arr[i]=temp;

                partionIndex++;
            }
        }
        int temp= arr[partionIndex];
        arr[partionIndex]=arr[end];
        arr[end]=temp;
        return partionIndex;
    }
}
