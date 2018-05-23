import java.util.*;
class solution{
    public static void main(String aa[]){
        String k;
        int b=0;
        //ArrayList<Integer>a=new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        k=s.next();
        char l[]=k.toCharArray();
        ArrayList<Integer>ll=new ArrayList<Integer>();
        for(int i=0;i<l.length-1;i+=2){
            if(l[i]=='a'){
                b++;
            }
            if(l[i+1]=='b'){
                b++;
            }
            
            else{
               //  ArrayList<Integer>a=new ArrayList<Integer>();
               int u=b;
                 ll.add(u);
                b=0;
            }
            
        }
        if(l[l.length-1]=='a'){
                b++;
            }
         if(!ll.isEmpty()){
        int y=Collections.max(ll);
              System.out.println(y);
         }
         else{
         System.out.println(b);
         }
    }
}
