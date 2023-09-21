package assignment1;
import java.util.*;

public class prime_factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=2;
		
		while(i<n) {
		
			while(n%i==0) {
				System.out.print(i+" ");
				n=n/i;
			}
			i++;
		}
	}

}
