package assignment1;
import java.util.*;
import java.lang.*;

public class Basic_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		int N1,N2;
		double o;
		do {
			ch = sc.next().charAt(0);
			N1 = sc.nextInt();
			N2 = sc.nextInt();
			
			switch(ch) {
			case '+':
				o=(N1+N2);
				System.out.println(o);
				break;
			case '-':
				o=(N1-N2);
				System.out.println(o);
				break;
			case '*':
				o=N1*N2;
				System.out.println(o);
				break;
			case '/':
				o=N1/N2;
				System.out.println(o);
				break;
			case '%':
				o=(N1%N2);
				System.out.println(o);
				break;
			case 'x':
			case 'X':
				break;
			default:
				System.out.println("Invalid operation.Try again");
				break;
			}
		} while(((char)ch != 'x')||((char) ch != 'X'));
		/*char ch = sc.next().charAt(0);
		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		
		switch(ch) {
		case '+':
			System.out.println(N1+N2);
			break;
		case '-':
			System.out.println(N1-N2);
			break;
		case '*':
			System.out.println(N1*N2);
			break;
		case '/':
			System.out.println(N1/N2);
			break;
		case 'x':
		case 'X':
			break;
		default:
			System.out.println("Invalid operation.Try again");
		}*/
	}
}
