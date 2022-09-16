import java.util.*;
 
public class Codeforces{
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        while(t>0){
            String str = s.next();
            if(str.length()<=10){
                System.out.println(str);
            }
            else{
                int midLen = str.length()-2;
                System.out.println(str.charAt(0) + "" + midLen +""+ str.charAt(str.length()-1));            }
            t--;
        }
    }
}
