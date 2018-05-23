import java.util.*;
class jj{
    public static void main(String aa[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        ArrayList<Integer>b=new ArrayList<Integer>();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                a.add(a[i]);
                count++;
            }
        }
        System.out.println(count+1);
    }
}
