public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,8,2,5,6,9,1,3};
        sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void sort(int[] arr){
        int len = arr.length;

        for(int i=0; i<len-1; i++){
            int minIndex= i;
            int j=i+1;
            while(j < len){
                if(arr[j] < arr[minIndex]){
                    minIndex= j;
                }
                j++;
            }

            int temp= arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
