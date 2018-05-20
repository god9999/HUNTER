import java.util.*;
import java.math.*;
class yy{
    public static void main(String aa[]){
       HashMap<Integer,Integer>a=new HashMap<Integer,Integer>();
       int n;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
       for(int i=0;i<n;i++){
           int c=s.nextInt();
           int b=s.nextInt();
           a.put(c,b);
       }
      int y=1;
      int u=1;
      int v=1;
      
       for(int i=1;i<n;i+=2){
           if(a.get(i)==1){
               u++;
           }
           if(a.get(i)==3){
               v++;
           }
           if(a.get(i)==5){
               y++;
           }
       }
       if(u>1){
           System.out.println(1);
       }
       if(v>1){
           System.out.println(3);
       }
       if(y>1){
           System.out.println(5);
       }
       
    }
}
