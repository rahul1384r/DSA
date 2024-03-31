// import java.util.ArrayList;
// import java.util.List;

// public class Recursion_3 {
//     public static void main(String[] args) {
//         List<String> list=new ArrayList<>();
//         String s="aba";
//         uniquePermutation(s,"",list);
//         System.out.println(list);
//     }
//     private static void uniquePermutation(String s,String ans,List<String> list){
//         if(s.length()==0){
//             if(list.contains(ans)){

//             }
//             else{
//                 list.add(ans);
//             }
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<s.length();i++){
//             uniquePermutation(s.substring(0, i)+s.substring(i+1),ans+s.charAt(i), list);
//         }
//     }
// }



import java.util.ArrayList;
import java.util.List;

public class Recursion_3 {
    public static void main(String[] args) {
        
        String s="aba";
        uniquePermutation(s,"");
    }
    private static void uniquePermutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            boolean b=false;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    b=true;
                    break;
                }
            }
            if(b==false){
                uniquePermutation(s.substring(0, i)+s.substring(i+1),ans+s.charAt(i));
            }
        }
    }
}





