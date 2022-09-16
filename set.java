//Boston number correct code.
import java.util.Scanner;
public class set {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int r=0,c=2,p=n,rem=0,s=0,l=0;
         while(p>1)
         {  
            if(p%c==0)
            {  l=0;
                p=p/c;
                
                if(c>=10)
                {int d=c,v=0;
                    while(d>0)
                    {v=d%10;
                    l=l+v;
                    d=d/10;}
                 
                }
            

               if(c<10)
                r=r+c;
                else if(c>=10)
                r=r+l;
             
            }
            else
            c++;
         }
        //  System.out.println(l);
        //  System.out.println(r);
        while(n>0)
        {
            rem=n%10;
            s=rem+s;
            n=n/10;
        }
        if(s==r)
        System.out.println("1");
        else
        System.out.println("0");
         
        
    }
}
