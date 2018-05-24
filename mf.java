import java.util.*;
class mf{
    public static void main(String aa[]){
        Scanner s=new Scanner(System.in);
        String d=s.next();
        String  v[]=d.split("[0-9]");
        String v1[]=d.split("[a-z]");
       
       int o=0;
        for(int i=1;i<v1.length;i++){
            String h=v1[i];
            int y=Integer.parseInt(h);
            for(int j=0;j<y;j++){
                System.out.print(v[o]);
            }
            o++;
    }
            }
}
    
