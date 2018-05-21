import java.util.*;
import java.math.*;
class exe{
    public static void main(String aa[]){
        int l,k;
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=s.nextInt();
       }
       int sum=1;
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i==j){
                   continue;
               }
               else{
                   sum=sum*a[j];
               }
           }
           System.out.print(sum+" ");
           sum=1;
       }
    }
}
