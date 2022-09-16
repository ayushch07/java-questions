import java.util.Scanner;
import java.util.*;
public class chew {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
             long  n=sc.nextLong();
              long t,r,v=0;
            n=rev(n);
            r=n%10;
            if(r==9)
           { v=9;
            n=n/10;
             }
            
            
             
             while(n>0)
                {
                    r=n%10;
                    t=9-r;
                    // if(t<r)
                    // v=v*10+t;
                    // else 
                    v=v*10+(Math.min(t,r));
                    n=n/10;
                }
             
             System.out.println(v);
            
          
    }
   
    

    static long  rev(long n){
        long re=0,r;
        while(n>0)
        {
            r=n%10;
            re=re*10+r;
           n=n/10;
        }
        return re;
    }
    
         
    
}
     