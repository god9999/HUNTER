import java.io.*;
import java.util.*;
class rr {
	public static void main (String[] args) {
	 int n;
	 Scanner s=new Scanner(System.in);
	 n=s.nextInt();
	int k=s.nextInt();
	ArrayList<ArrayList<Integer>>a=new ArrayList<ArrayList<Integer>>();
	ArrayList<Integer>b=new ArrayList<Integer>();
	for(int i=0;i<n;i++){
	     a.add(new ArrayList<Integer>());
	}
	
		for(int i=0;i<n;i++){
	    for(int j=0;j<k;j++){
	        int yy=s.nextInt();
	        a.get(i).add(yy);
	    }
	}
	int uu;
	int c=1;
	int pp1=0;
	  for(int i=0;i<k;i++){
	       uu=a.get(pp1).get(i);
	       //System.out.println(uu);
	      for(int j=1;j<n;j++){
	          if(a.get(j).contains(uu)){
	              c++;
	          }
	      }
	      if(c==n-1){
	         b.add(uu);
	      }
	      c=0;
	  }
	  for(Integer r:b){
	      System.out.print(r+" ");
	  }
	}
}
