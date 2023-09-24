/*
Given a series of N Integers, check if it is possible to split sequence into two sequences -
s1 to si and si to sN such that first sequence is strictly decreasing and second is strictly increasing. Print true/false as output.
Input Format
First line contains a single integer N denoting the number of elements int the series.
Next N lines contain a single integer each denoting the elements of the array S.
Constraints
0 < N < 1000 Each number in sequence S is > 0 and < 1000000000
Output Format
Print boolean output - "true" or "false" defining whether the sequence is increasing - decreasing or not.
Sample Input
5 
1 
2 
3 
4 
5

Sample Output
true

Explanation
Carefully read the conditions to judge which all sequences may be valid. Don't use arrays or lists.
 */
package assignment1;
import java.util.*;

public class Increasing_Decreasing_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int s,M=N,prev,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,cnt_max=0,cnt_min=0;
		while(N>0) {
			s=sc.nextInt();
			if(s>max) {
				max=s;
				cnt_max++;
			} else if(s<min) {
				min=s;
				cnt_min++;
			}
			N--;
		}
		if((M==cnt_max) || (M==cnt_min)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
