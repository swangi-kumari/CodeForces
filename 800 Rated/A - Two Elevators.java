// A. Two Elevators
// time limit per test1 second
// memory limit per test256 megabytes
// inputstandard input
// outputstandard output
// Vlad went into his appartment house entrance, now he is on the 1-th floor. He was going to call the elevator to go up to his apartment.

// There are only two elevators in his house. Vlad knows for sure that:

// the first elevator is currently on the floor 𝑎 (it is currently motionless),
// the second elevator is located on floor 𝑏 and goes to floor 𝑐 (𝑏≠𝑐). Please note, if 𝑏=1, then the elevator is already leaving the floor 1 and Vlad does not have time to enter it.
// If you call the first elevator, it will immediately start to go to the floor 1. If you call the second one, then first it will reach the floor 𝑐 and only then it will go to the floor 1. It takes |𝑥−𝑦| seconds for each elevator to move from floor 𝑥 to floor 𝑦.

// Vlad wants to call an elevator that will come to him faster. Help him choose such an elevator.

// Input
// The first line of the input contains the only 𝑡 (1≤𝑡≤104) — the number of test cases.

// This is followed by 𝑡 lines, three integers each 𝑎, 𝑏 and 𝑐 (1≤𝑎,𝑏,𝑐≤108, 𝑏≠𝑐) — floor numbers described in the statement.

// Output
// Output 𝑡 numbers, each of which is the answer to the corresponding test case. As an answer, output:

// 1, if it is better to call the first elevator;
// 2, if it is better to call the second one;
// 3, if it doesn't matter which elevator to call (both elevators will arrive in the same time).
// inputCopy
// 3
// 1 2 3
// 3 1 2
// 3 2 1
// outputCopy
// 1
// 3
// 2


//Solution
import java.util.*;
 
public class TwoElevators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t>0){
            long a = s.nextInt();
            long b = s.nextInt();
            long c = s.nextInt();
            long first = Math.abs(a-1);
            long second = Math.abs(c-b) + Math.abs(c-1);
            if(first<second){
                System.out.println(1);
            }
            else if(second<first){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
            t--;
        }
    }
}
