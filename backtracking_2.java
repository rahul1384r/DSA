import java.util.*;
public class backtracking_2 {

    public static void print(int[] arr,int target,List<Integer> list,List<Integer> ans){
        if(target==0){
            System.out.println(list);
            ans.add(list);
            return;
        }
        if(target<0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            print(arr,target-arr[i],list,ans);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;
        List<Integer> list=new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<Integer>();
        print(arr,7,list,ans);
    }
}
