import java.util.*;
public class har {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
       { 
        int a=sc.nextInt();
        int h=sc.nextInt();
        int t1=1,t2=2;
        if(a==0)
        t1=0;
        if(h==0)
        t2=0;

        while(a>t1)
        {
            t1=t1+2;
            
        
        }
        while(h>t2)
        {
            t2=t2+2;
        
        }
        if(t1>t2)
        System.out.println("Aayush");
        else if(t2>t1) 
        System.out.println("Harshit");
        t--;
        }



    }
}