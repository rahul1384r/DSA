public class arr {

    public static void print(int[][] arr,int row,int col,String ans){
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(ans);
            return;
        }
        if(col<arr[0].length-1){
            print(arr,row,col+1,"H");
        }
        if(row<arr.length-1){
            print(arr,row+1,col,"V");
        }
        
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        print(arr,0,0,"");

    }
}
