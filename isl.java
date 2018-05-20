import java.io.*;
import java.util.*;
class isl{
	public static void main (String[] args) {
	 int n;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	 int a[][]=new int[n][n];
	 for(int i=0;i<n;i++){
	     for(int j=0;j<n;j++){
	         a[i][j]=s.nextInt();
	     }
	 }
	 int c=0;
	 int m=0;
	 for(int i=0;i<n;i++){
	     for(int j=0;j<n;j++){
	         if(a[i][j]==0){
	            c++; 
	         }
	     }
	     if(c==n){
	         m++;
	     }
	     c=0;
	 }
	 System.out.println(m);
	}
}
