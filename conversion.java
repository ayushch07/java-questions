import java.util.*;
public class conversion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int d=sc.nextInt();  
        int n=sc.nextInt();
        int r=0,b=0,p=1;
        while(n>0)
        { r=n%10;
          b=b+r*p;
          p=p*s;
          n=n/10;

        }
    
        n=b;
        b=0;
        p=1;
        
      System.out.println(n);
        while(n>0)
        {
            r=n%d;
            b=b+r*p;
            p=p*10;
            n=n/d;
        }


        System.out.println(b);


    }
}