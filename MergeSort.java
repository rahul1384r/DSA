import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr1,int[] arr2){
        int ans[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int idx=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[idx++]=arr1[i++];
            }
            else{
                ans[idx++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[idx++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[idx++]=arr2[j++];
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void mergeArray(int[] arr,int start,int end){
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        mergeArray(arr, start, mid);
        mergeArray(arr, mid+1, end);
        mergeSort(arr, arr);
    }
    public static void main(String[] args) {
        int arr1[]={1,2,4,7,8,9};
        int arr2[]={2,3,5,6};
        mergeSort(arr1,arr2);
    }
}


