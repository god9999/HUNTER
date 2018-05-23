import java.util.*;
class perm{
    public static void main(String aa[]){
        String a;
        Scanner s=new Scanner(System.in);
        a=s.next();
        char t[]=a.toCharArray();
        ArrayList<Integer>s1=new ArrayList<Integer>();
        for(int i=1;i<=t.length;i++){
            for(int j=0;j<t.length-1;j++){
                char t1=t[j];
                t[j]=t[j+1];
                t[j+1]=t1;
                 String f=String.valueOf(t);
            System.out.println(f);
            int a1=Integer.parseInt(a);
            int a2=Integer.parseInt(f);
            if(a2>a1){
                s1.add(a2);
            }
            }
            
        }
        System.out.println(Collections.min(s1));
    }
}
