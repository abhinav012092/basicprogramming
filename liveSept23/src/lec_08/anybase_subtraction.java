package lec_08;
import java.util.*;

public class anybase_subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int d = getDifference(b, n1, n2);
		System.out.println(d);
	}
	
	public static int getDifference(int b, int n1, int n2) {
		int rv=0,c=0,p=1;
		while(n2>0) {
			int d1 = n1%10;
			n1/=10;
			int d2 = n2%10;
			n2/=10;
			
			int d=0;
			d2 = d2 + c;
			if(d2>=d1) {
				c=0;
				d=d2-d1;
			} else {
				c=-1;
				d=d2+b-d1;
			}
			rv+=d*p;
			p*=10;
		}
		
		return rv;
	}

}