import java.util.*;
public class large{
      public static void main(String aa[]){
            int n,m;
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            LinkedHashSet<Integer>d=new LinkedHashSet<Integer>();
            for(int i=0;i<n;i++){
                m=s.nextInt();
                d.add(m);
            }
            ArrayList<Integer>a=new ArrayList<Integer>(d);
            Collections.sort(a,Collections.reverseOrder());
            for(int j:a){
                System.out.print(j);
            }

    }
}
