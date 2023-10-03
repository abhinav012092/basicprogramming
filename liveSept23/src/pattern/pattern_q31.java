package pattern;
import java.util.*;

public class pattern_q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row=1, col;
		while(row<=n) {
			col=n;
			while(col>=1) {
				if(row!=col) {
					System.out.print(col+" ");
				} else {
					System.out.print("* ");
				}
				col--;
			}
			row++;
			System.out.println();
		}
	}

}
