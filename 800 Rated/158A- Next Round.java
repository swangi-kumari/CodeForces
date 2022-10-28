/**
158A. Next Round
time limit per test3 seconds
memory limit per test256 megabytes
inputstandard input
outputstandard output
"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.

Examples
inputCopy
8 5
10 9 8 7 7 7 5 5
outputCopy
6
inputCopy
4 2
0 0 0 0
outputCopy
0
**/


//Solution
import java.util.*;
public class A_NextRound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k  = s.nextInt();
        int[] arr = new int[10000];
        for(int i  = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int temp = arr[k-1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= temp && arr[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

