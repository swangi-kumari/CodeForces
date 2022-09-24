import java.util.*;
public class A_BitPlusPlus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
 
        int n = s.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i< n; i++){
            arr[i] = s.next();
        }
        for(int i = 0; i< n; i++){
            if(Objects.equals(arr[i], "++X") || Objects.equals(arr[i],"X++")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
