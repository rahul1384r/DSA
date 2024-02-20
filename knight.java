public class knight {
    public static void print(int[][] arr,int row,int col){
        if(row>=arr.length || col>=arr[0].length){
            return;
        }
        if(row==arr.length || col==arr[0].length){
            return;
        }
        int r[]={2,1};
        int c[]={1,2};
        for(int i=0;i<c.length;i++){
            print(arr,row+r[i],col+c[i]);
        }
        if(row==0 || col==0 || row==arr.length-1 || col==arr[0].length-1){
            for(int i=1;i<arr.length;i++){
                print(arr,row+i,col);
            }
            for(int i=1;i<arr[0].length;i++){
                print(arr, row, col+i);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        print(arr,0,0);
    }
}


