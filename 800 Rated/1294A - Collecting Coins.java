/***
1294A. Collecting Coins
time limit per test2 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
Polycarp has three sisters: Alice, Barbara, and Cerene. They're collecting coins. Currently, Alice has ๐ coins, Barbara has ๐ coins and Cerene has ๐ coins. Recently Polycarp has returned from the trip around the world and brought ๐ coins.

He wants to distribute all these ๐ coins between his sisters in such a way that the number of coins Alice has is equal to the number of coins Barbara has and is equal to the number of coins Cerene has. In other words, if Polycarp gives ๐ด coins to Alice, ๐ต coins to Barbara and ๐ถ coins to Cerene (๐ด+๐ต+๐ถ=๐), then ๐+๐ด=๐+๐ต=๐+๐ถ.

Note that A, B or C (the number of coins Polycarp gives to Alice, Barbara and Cerene correspondingly) can be 0.

Your task is to find out if it is possible to distribute all ๐ coins between sisters in a way described above.

You have to answer ๐ก independent test cases.

Input
The first line of the input contains one integer ๐ก (1โค๐กโค104) โ the number of test cases.

The next ๐ก lines describe test cases. Each test case is given on a new line and consists of four space-separated integers ๐,๐,๐ and ๐ (1โค๐,๐,๐,๐โค108) โ the number of coins Alice has, the number of coins Barbara has, the number of coins Cerene has and the number of coins Polycarp has.

Output
For each test case, print "YES" if Polycarp can distribute all ๐ coins between his sisters and "NO" otherwise.

Example
inputCopy
5
5 3 2 8
100 101 102 105
3 2 1 100000000
10 20 15 14
101 101 101 3
outputCopy
YES
YES
NO
NO
YES
**/

import java.util.Arrays;
import java.util.Scanner;
 
public class A_CollectingCoins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0) {
            int arr[] = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = s.nextInt();
            }
            int p = s.nextInt();
            Arrays.sort(arr);
            int a = arr[2] - arr[0];
            int b = arr[2] - arr[1];
            int sum = a + b;
            int ans = p - sum;
            if(ans < 0){
                System.out.println("no");
            }
            else if (ans % 3 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            t--;
        }
    }
}
