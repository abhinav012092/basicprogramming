package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class keypad_codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> words = new ArrayList<String>();
		words = getKeyPadCodes(str);
		for(int i=0;i<words.size();i++) {
			System.out.print(words.get(i)+" ");
		}
		System.out.println();
		System.out.println(words.size());
	}
	static String[] codes = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static ArrayList<String> getKeyPadCodes(String str){
		if(str.length()==0) {
			ArrayList<String> bres = new ArrayList<String>();
			bres.add("");
			return bres;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rres = getKeyPadCodes(ros);
		ArrayList<String> mres = new ArrayList<String>();
		
		String codeforch = codes[ch-'0'];
		for(int i=0;i<codeforch.length();i++) {
			char chcode = codeforch.charAt(i);
			for(String rstr: rres) {
				mres.add(chcode+rstr);
			}
		}
		return mres;
	}
}
