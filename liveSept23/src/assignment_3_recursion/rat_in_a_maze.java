package assignment_3_recursion;
import java.util.*;
import java.io.*;

public class rat_in_a_maze {

	//private static final String 'X' = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Nr = sc.nextInt();
		int Mc = sc.nextInt();
		char[][] maze = new char[Nr][Mc];
		for(int i=0;i<Nr;i++) {
			for(int j=0;j<Mc;j++) {
				maze[i][j]=sc.next().charAt(0);
			}
		}
		//maze= {{'O','X','O','O'}};
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		race(0,0,"",maze,visited);
	}
	
	public static void race(int r, int c, String path, char[][] maze, boolean[][] visited) {
		int[][] ans = new int[maze.length][maze[0].length];
		ans[0][0]=1;
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(path);
			for(int i=0,j=0,x=0,y=0;i<maze.length;i++,j++) {
				char ch = path.charAt(i);
				if(ch=='D') {
					ans[++x][y]=1;
				} else if(ch=='R') {
					ans[x][++y]=1;
				}
			}
			for(int i=0;i<ans.length;i++) {
				for(int j=0;j<ans[0].length;j++) {
					System.out.print(ans[i][j]+" ");
				}
				System.out.println();
			}
			return;
		}
		if(r<0 || r>=maze.length||c>=maze[0].length||c<0||maze[r][c]=='X'||visited[r][c]==true) {
			return;
		}
		visited[r][c]=true;
		race(r+1,c,path+"D", maze,visited);
		race(r,c+1,path+"R",maze,visited);
	}

}
