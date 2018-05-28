import java.util.*;
class rot{
    public static void main(String aa[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        ArrayList<Integer>a=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int c=s.nextInt();
            a.add(c);
        }
        Collections.rotate(a,-k);
        for(Integer l:a){
            System.out.println(l+"");
        }
    }
}
