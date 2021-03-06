public class BubbleSort {
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
            int j=0;
            //after all j iterations we will have large element at the end of array so next time we dont need to consider that last element
            while(j < len-i-1){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] =arr [j];
                    arr[j]=temp;
                }
                j++;
            }
        }
    }
}
