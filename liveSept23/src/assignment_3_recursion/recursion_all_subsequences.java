package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class recursion_all_subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.next();
            String str=arr[i];
            //solve(str,"");
            ArrayList<String> al = new ArrayList<String>();
            al=solve(str,"",al);
            Collections.sort(al);
            for(int j=0;j<al.size();j++){
                System.out.println(al.get(j));
            }
        }
	}

    public static ArrayList<String> solve(String str, String path, ArrayList<String> al){
        if(str.isEmpty()){
            al.add(path);
            return al;
        }

        char ch = str.charAt(0);
        String sp = str.substring(1);
        ArrayList<String> bl = solve(sp, path, al);
        ArrayList<String> cl = solve(sp, path+ch, al);
        return al;
    }
}
