public class knight {
    public static void print(int[][] arr,int row,int col,String ans){
        if(row>=arr.length || col>=arr[0].length){
            return;
        }
        ans+="{"+row+"-"+col+"}";
        if(row== arr.length-1 && col==arr[0].length-1){
            System.out.println(ans+" ");
            count++;
            return;
        }
        // for knight
        int r[]={2,1};
        int c[]={1,2};
        for(int i=0;i<c.length;i++){
            print(arr,row+r[i],col+c[i],ans+"K");
        }
        // for rook
        if(row==0 || col==0 || row==arr.length-1 || col==arr[0].length-1){
            // for row
            for(int i=1;i<arr.length;i++){
                print(arr,row+i,col,ans+"R");
            }
            // for col
            for(int i=1;i<arr[0].length;i++){
                print(arr, row, col+i,ans+"R");
            }
        }
        // for bishop
        if(row==col || row+col==arr.length-1){
            for(int i=1;i<arr.length;i++){
                print(arr, row+i, col+i,ans+"B");
            }
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        print(arr,0,0,"");
        System.out.println(count);
    }
}


