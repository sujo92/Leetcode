public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,10,12,1,5,6};
        sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void sort(int[] arr) {
        int len = arr.length;

        for(int i=1; i<len; i++){
            int currIndex= i;
            while(currIndex > 0 && arr[currIndex] < arr[currIndex-1]){
                int temp= arr[currIndex-1];
                arr[currIndex-1] = arr[currIndex];
                arr[currIndex] = temp;
                currIndex--;
            }
        }
    }
}
