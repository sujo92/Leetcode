import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{432,8,530,90,88,231,11,45,677,199};
        radixSort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    //Counting sort is efficient if the range of input data is not greater.
    //O(n) time complexity
    public static void radixSort(int[] arr) {
        int max= Arrays.stream(arr).max().getAsInt();

        //run this loop for number of digits in max number and increment position by 10 each time(1,10,100,1000)
        for(int pos=1; max/pos>0; pos*=10){
            arr = countingSort(arr,pos);
        }
    }

    private static int[] countingSort(int[] arr, int pos) {
        //create count array of size 10 as we are considering single digit at time which ranges from 0-9
        int[] count= new int[10];
        int[] output = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            //for decimal place 536/10 = 53 and then 53%10=3 so we got decimal place digit
            //for hundredth place 536/100 = 5 and then 5%10=5 so we got hundredth place digit
            int curr = (arr[i]/pos) % 10;
            //count frequency of each digit occurrence
            count[curr]++;
        }

        //count the index position in count array
        for(int c=1; c<count.length; c++){
            count[c] += count[c-1];
        }

        //update output array with sorted array. start from back of arr for stable sorting
        for(int i=arr.length-1; i>=0; i--){
            int curr = (arr[i]/pos) % 10;
            count[curr]--;
            output[count[curr]] =  arr[i];
        }

        //place output array in original arr
        for(int i=0; i<output.length; i++){
            arr[i] = output[i];
        }

        return arr;
    }
}
