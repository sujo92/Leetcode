public class MergeSort {
    public static void main(String[] args) {
        
        int[] arr= new int[]{4,3,2,10,12,1,5,6};
        int[] merged = new int[arr.length];

        sort(arr, 0 , arr.length-1, merged);

        for(int a: merged){
            System.out.println(a);
        }
    }

    //this actually does postorder recursion divide until single element left and them merge back to top
    public static void sort(int[] arr, int start, int end, int[] merged){
        if(start < end){
            int mid = start+(end-start)/2;
            //recurse on left side till you get single element ar end
            sort(arr, start, mid, merged);
            //recurse on right side
            sort(arr, mid+1, end, merged);
            //when we have more than one element sorted merge them
            merge(arr, start, mid, end, merged);
        }
        return;
    }

    public static void merge(int[]arr, int leftstart,int leftend, int rightend, int[] merged){
        int l1=leftstart;
        int l2=leftend;
        int r1= leftend +1;
        int r2= rightend;
        int index = leftstart;

        //whichever is small from left and right element copy that to auxilary array merged
        while(l1 <= l2  && r1 <= r2){
            if(arr[l1] <= arr[r1]){
                merged[index++] = arr[l1++];
            }else{
                merged[index++] = arr[r1++];
            }
        }

        //copy remaining element of left
        while(l1 <= l2){
            merged[index++] = arr[l1++];
        }

        //opy remaining element of right
        while(r1 <= r2){
            merged[index++] = arr[r1++];
        }

        //copy this sorted part in actual array
        for(int i=leftstart; i<=rightend; i++){
            arr[i] = merged[i];
        }

        return;
    }
}
