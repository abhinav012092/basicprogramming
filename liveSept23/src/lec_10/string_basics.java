package lec_10;
import java.util.*;
import java.lang.*;
import java.io.*;

public class string_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String s1 = sc.nextLine();
		//System.out.println(s1);
		//System.out.println(s1.length());
		
		
		//char ch = s1.charAt(0);
		//System.out.println(ch);
		
		//for(int i=0;i<s1.length();i++) {
			//ch=s1.charAt(i);
			//System.out.print(ch);
		//}
		
		String s2 = "abcd";
		//System.out.println(s2.substring(1, 3));//bc
		//System.out.println(s2.substring(0, 1));//a
		for(int i=0;i<s2.length();i++) {
			for(int j=i+1;j<=s2.length();j++) {
				System.out.println(s2.substring(i, j));
			}
			System.out.println();
		}
	}

}
