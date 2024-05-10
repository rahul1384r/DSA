// public class Practical{
//     public static void unique(String str,String ans){
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             unique(str.substring(0,i)+str.substring(i+1), ans+str.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str="aba";
//         String ans="";
//         unique(str, ans);
//     }
// }



// public class Practical{
//     public static void unique(String str,String ans){
//         if(str.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             boolean b=false;
//             for(int j=i+1;j<str.length();j++){
//                 if(str.charAt(i)==str.charAt(j)){
//                     b=true;
//                     break;
//                 }
//             }
//             if(b==false){
//                 unique(str.substring(0,i)+str.substring(i+1), ans+str.charAt(i));
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String str="aba";
//         String ans="";
//         unique(str, ans);
//     }
// }

// import java.util.*;

// public class Practical{
//     public static void unique(String str,String ans,List<String> list){
//         if(str.length()==0){
//             if(list.contains(ans)){

//             }else{
//                 list.add(ans);
//             }
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             unique(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i), list);
//         }
//     }
//     public static void main(String[] args) {
//         String str="aba";
//         String ans="";
//         List<String> list=new ArrayList<>();
//         unique(str, ans,list);
//         System.out.println(list);
//     }
// }



// public class Practical{
//     public static void unique(int n,int ans){
//         if(ans>n){
//             return;
//         }
//         System.out.println(ans);
//         int i=0;
//         if(ans==0){
//             i=1;
//         }
//         for(;i<=9;i++){
//             unique(n, ans*10+i);
//         }
//     }
//     public static void main(String[] args) {
//         int n=15;
//         for(int i=1;i<9;i++){
//             unique(n, i);
//         }
//     }
// }




// public class Practical{
//     public static boolean search(char[][] arr,int row,int col,int idx,String str){
//         if(idx==str.length()){
//             return true;
//         }
//         if(row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col]!=str.charAt(idx)){
//             return false;
//         }

//         int r[]={1,0,-1,0};
//         int c[]={0,1,0,-1};
//         boolean flag=false;
//         char ch=arr[row][col];
//         arr[row][col]='*';
//         for(int i=0;i<4;i++){
//             flag=search(arr, row+r[i], col+c[i], idx+1, str);
//             if(flag){
//                 return flag;
//             }
//         }
//         arr[row][col]=ch;
//         return flag;
//     }
//     public static void main(String[] args) {
//         char arr[][]={{'A','B','C','E'},
//                       {'S','F','C','S'},
//                       {'A','D','E','E'}};
//         String str="ABCCED";
//         for(int row=0;row<arr.length;row++){
//             for(int col=0;col<str.length();col++){
//                 if(arr[row][col]==str.charAt(0)){
//                     boolean flag=search(arr, row, col, 0, str);
//                     if(flag){
//                         System.out.println(true);
//                         return;
//                     }
//                 }
//             }
//             System.out.println(false);
//             return;
//         }
//     }
// }

// import java.util.List;

// public class Practical{
//     public static void print(int[][] arr,int row,int col,String ans){
//         if(row>=arr.length || col>=arr[0].length){
//             return;
//         }
//         ans+="{"+row+"-"+col+"}";
//         if(row==arr.length-1 && col==arr[0].length-1){
//             System.out.println(ans+" ");
//         }

//         int r[]={2,1};
//         int c[]={1,2};

//         for(int i=0;i<c.length;i++){
//             print(arr, row+r[i], col+c[i], ans+"K");
//         }
//         if(row==0 || col==0 || row==arr.length-1 || col==arr[0].length-1){
//             for(int i=1;i<arr.length;i++){
//                 print(arr, row+i, col, ans+"R");
//             }
//             for(int i=1;i<arr[0].length;i++){
//                 print(arr, row, col+i, ans+"R");
//             }
//         }

//         if(row==col || row+col==arr.length-1){
//             for(int i=1;i<arr.length;i++){
//                 print(arr, row+i, col+i, ans+"B");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[][]=new int[3][3];
//         print(arr, 0, 0, "");
//     }
// }




// import java.util.*;
// public class Practical{
//     public static void print(int[] arr,int target,List<Integer> list,List<List<Integer>> ans){
//         if(target==0){
//             System.out.println(list);
//             List<Integer> ll=new ArrayList<Integer>(list);
//             ans.add(ll);
//             return;
//         }

//         if(target<0){
//             return;
//         }

//         for(int i=0;i<arr.length;i++){
//             list.add(arr[i]);
//             print(arr, target-arr[i], list, ans);
//             list.remove(list.size()-1);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={2,3,6,7};
//         int target=7;
//         List<Integer> list=new ArrayList<Integer>();
//         List<List<Integer>> ans=new ArrayList<List<Integer>>();
//         print(arr, 7, list, ans);
//         System.out.println(ans);
//     }
// }





import java.util.*;
public class Practical{
    public static void print(int[] board,int tq,int qp,String ans,int idx){
        if(qp>tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<board.length;i++){
            if(board[i]==0){
                board[i]=1;
                print(board, tq, qp+1, ans+"B"+i+"Q"+qp, idx+1);
                board[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        int tq=2;
        int board[]=new int[4];
        print(board, tq, 1, "", 0);
    }
}


