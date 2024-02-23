public class Recursion_1 {
    static int a=0;
    public static void main(String[] args) {
        int n=5;
        int count=0;
        comb(n,"");
        // System.out.println(a);
    }
    private static void comb(int n,String ans){
        if(n==0){
            a++;
            System.out.println(ans);
            return;
        }
        
        if(n<0){
            return;
        }
        comb(n-1,ans+1);
        comb(n-2,ans+2);
        comb(n-3,ans+3);
        comb(n-4, ans+4);
       
    }
}



// public class Recursion_1 {
//     static int a=0;
//     public static void main(String[] args) {
//         int n=5;
//         int k=fib(n);
//         System.out.println(k);
//     }
//     private static int fib(int n){
//         if(n==0 || n==1){
//             return n;
//         }
        
//         int a=fib(n-1);
//         int b=fib(n-2);
        
//         return a+b;
//     }
// }