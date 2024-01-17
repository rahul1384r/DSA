// public class Recursion_1 {
//     static int a=0;
//     public static void main(String[] args) {
//         int n=4;
//         int count=0;
//         int k=comb(n,"");
//         System.out.println(k);
//         System.out.println(a);
//     }
//     private static int comb(int n,String ans){
//         if(n==0){
//             a++;
//             System.out.println(ans);
//             return 1;
//         }
        
//         if(n<0){
//             return 0;
//         }
//         int a=comb(n-1,ans+1);
//         int b=comb(n-2,ans+2);
//         int c=comb(n-3,ans+3);
//         return a+b+c;
//     }
// }



public class Recursion_1 {
    static int a=0;
    public static void main(String[] args) {
        int n=5;
        int k=fib(n);
        System.out.println(k);
    }
    private static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        
        int a=fib(n-1);
        int b=fib(n-2);
        
        return a+b;
    }
}