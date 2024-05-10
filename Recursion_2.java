public class Recursion_2 {
    public static void main(String[] args) {
        String s="abc";
        String subString="";
        int length=s.length();
        find(s,"");
    }
    private static void find(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        find(s.substring(1), ans+s.charAt(0));
        find(s.substring(1), ans);
    }
}

