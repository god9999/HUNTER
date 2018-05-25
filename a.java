import java.util.*;
class a{
    //static int count=0;
    static String k="[3-4]";
     long yy=0;
     long check(int n1,long s,int count){
            String h=String.valueOf(s);
            String j=h.replaceAll(k,"");
            //System.out.println(h);
          if(count==n1)
            return yy;
            s=Long.parseLong(h);
            
          if(j.isEmpty()){
             count++;
            yy=s;
          }
            return  check(n1,++s,count);
             
         }
        
    public static void main(String a[]){
        Scanner s=new Scanner(System.in);
        long f=3;
        int n=s.nextInt();
        a i=new a();
        long o=i.check(n,f,0);
        System.out.println(o);
    }
}
