public class leetcode_79 {
    public static void main(String[] args) {
        char arr[][]={{'A','B','C','E'},
                      {'S','F','C','S'},
                      {'A','D','E','E'}};
        String word="ABCCED";
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<word.length();col++){
                if(arr[row][col]==word.charAt(0)){
                    boolean flag=search(arr,row,col,0,word);
                    if(flag){
                        System.out.println(true);
                        return;
                    }
                }
            }
            System.out.println(false);
        }
    }

    private static boolean search(char[][] arr, int row, int col, int idx,String word) {
        if(idx==word.length()){
            return true;
        }
        if(row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col]!=word.charAt(idx)){
            return false;
        }

        int r[]={1,0,-1,0};
        int c[]={0,1,0,-1};

        boolean flag=false;
        char ch=arr[row][col];
        arr[row][col]='*';
        for(int i=0;i<4;i++){
            flag=search(arr, row+r[i], col+c[i], idx+1,word);
            if(flag){
                return flag;
            }
        }
        arr[row][col]=ch;
        return flag;

    }
}
