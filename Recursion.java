// // 1)
// import java.util.Arrays;

// public class Recursion{
//     public static void main(String[] args) {
//         int[] arr={1,2,3,2,2};
//         int target=2;
//         int indx=0;
//         int count=0;
//         int ans[]=find(arr, target, indx, count);
//         System.out.println(Arrays.toString(ans));
//     }
//     private static int[] find(int[] arr,int target,int indx,int count){
//         if(indx==arr.length){
//             System.out.println(count);
//             return new int[count];
//         }
//         if(arr[indx]==target){
//             count++;
//         }
//         int ans[]=find(arr,target,indx+1,count);
//         if(arr[indx]==target){
//             ans[count-1]=indx;
//         }
//         return ans;
//     }
// }



// // 2)
// public class Recursion{
//     public static void main(String[] args) {
//         int n=3;
//         toss(n,"");
//     }
//     private static void toss(int n,String ans){
//         if(n==0){
//             System.out.println(ans);
//             return;
//         }
//         toss(n-1,ans+"H");
//         toss(n-1,ans+"T");
//     }
// }



public class Recursion{
    public static void main(String[] args) {
        int n=3;
        toss(n,"");
    }
    private static void toss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
        toss(n-1,ans+"H");
        toss(n-1,ans+"T");
        }
    }
}