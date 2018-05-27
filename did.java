import java.util.*;
class a{
    public static void main(String aa[]){
        int a;
        int b;
        int c=1;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        while(a>b){
            a=a-b;
            c++;
        }
        System.out.println(c);
        
    }
}
