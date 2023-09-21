
package assignment1;
import java.util.*;

public class print_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int rev=0;
		while(N>0) {
			rev=rev*10+N%10;
			N/=10;
		}
		System.out.println(rev);
	}

}
