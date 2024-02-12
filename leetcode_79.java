public class leetcode_79 {
    public static void main(String[] args) {
        char arr[][]={{'A','B','C','E'},
                      {'S','F','C','S'},
                      {'A','D','E','E'}};
        String word="ABCCED";
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<word.length();j++){
                if(arr[i][j]==word.charAt(0)){
                    search(arr,i,j,0);
                }
            }
        }
    }

    private static void search(char[][] arr, int i, int j, int k) {
        int r[]={1,0,-1,0};
        int c[]={0,1,0,-1};
    }
}
