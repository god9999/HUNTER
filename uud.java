import java.util.*;
class uud{
     
     public static void main(String aa[]){
         int n;
         int c1=0;
         Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            b[i]=s.nextInt();
            c[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==b[i]){
                c1--;
            }
           if(b[i]==c[i]){
               c1--;
           }
           if(a[i]==c[i]){
               c1--;
           }
            else{
                c1++;
            }
        }
        System.out.println(c1);
         }
     }
