/*
Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
Input Format

A list of integers to be processed
Constraints
All numbers input are integers between -1000 and 1000.
Output Format
Print all the numbers before the cumulative sum become negative.

Sample Input
1
2
88
-100
49

Sample Output
1
2
88
 */
package assignment1;
import java.util.*;
public class Simple_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0,n;
		
		while(true) {
			n = sc.nextInt();
			sum+=n;
			if(sum>0) {
				System.out.println(n);
			} else {
				break;
			}
		}
	}

}
