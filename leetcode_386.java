public class leetcode_386{

    public static void print(int n,int ans){
        if(ans>n){
            return;
        }
        System.out.println(ans);
        int i=0;
        if(ans==0){
            i=1;
        }
        for(;i<=9;i++){
            print(n,ans*10+i);
        }
    }
    public static void main(String[] args) {
        int n=15;
        for(int i=1;i<9;i++){
            print(n,i);
        }
    }
}