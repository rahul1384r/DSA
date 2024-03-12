public class qs {
    public static void quickSort(int[] arr,int start,int end){
        if(start>end){
            return;
        }
        int pi=partitionIndex(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);        
    }
    public static int partitionIndex(int[] arr,int start,int end){
        int pivot=arr[arr.length-1];
        int pi=start;
        for(int i=start;i<end;i++){
            if(arr[i]<pivot){
                int temp=arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp=arr[pi];
        arr[pi]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return pi;
    }
    public static void main(String[] args) {
        int arr[]={2,4,3,8,9,-1,7,5};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
