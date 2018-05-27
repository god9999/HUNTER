import java.util.*;
class subst{
    public static void main(String aa[]){
        Scanner s=new Scanner(System.in);
        String h=s.next();
        int k=s.nextInt();
        for(int i=0;i<h.length()-1;i++){
            String d=h.substring(i,k);
            k++;
            System.out.print(d+" ");
        }
        
    }
}
