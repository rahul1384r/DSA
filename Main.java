import java.util.Scanner;

public class Main{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        gen(n,0);
    }
    public static void gen(int n,int sum){
        if(n==0){
            while(sum!=0){
                n=n*10+(sum%10);
                sum/=10;
            }
           System.out.println(n);
           return; 
        }
        int a=n%10;
        if(a==0){
            sum=sum*10+5;
        }
        else{
            sum=sum*10+a;
        }
        gen(n/10,sum);
}
}