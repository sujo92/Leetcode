import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,10,12,1,5,6};
        sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    //Counting sort is efficient if the range of input data is not greater.
    //O(n) time complexity
    public static void sort(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max= Arrays.stream(arr).max().getAsInt();

        int[] count = new int[max-min+1];
        int[] output = new int[arr.length];

        //update the count for each number occurence
        for(int i=0; i<arr.length; i++){
            int curr = arr[i]-min;
            count[curr]++;
        }

        //update the index at which each number will come
        for(int i=1; i<count.length; i++){
            count[i] = count[i-1] + count[i];
        }

        //create new sorted array
        for(int i=0; i<arr.length; i++){
            int curr = arr[i]-min;
            int currIndex = count[curr]-1;
            output[currIndex] = arr[i];
            count[curr]--;
        }

        //put this new sorted array in actual array
        for(int i=0; i<arr.length; i++){
            arr[i] = output[i];
        }
    }
}
