import java.util.*;

public class Codeforces{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n<4){
            System.out.println("NO");
        }
        else if(n%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
