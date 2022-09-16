
import java.util.*;
public class to {
    public static void main (String args[]) {
           Scanner sc=new Scanner(System.in);
		   int t=sc.nextInt();
		   while(t>0)
		   {
			   int a=sc.nextInt();
			   int r,b=0,p=1,c=0,d=0,rem;
               int z=sc.nextInt();
                float e=(float)z/2;
                System.out.println(e);

			   while(a>0)
			   {  r=a%2;
			      b=b+r*p;
                  if(b==0)
                  c=c+1;
                  else 
                  d=d+1;
				  p=p*10;
				  a=a/2;
				  	
				  }
                
                //   while(b>0)
                //   {
                //     rem=b%10;
                //     if(rem==0)
                //     c=c+1;
                //     else if(rem==1)
                //     d=d+1;
                //     b=b/10;
                //   }
			
			 System.out.print(d+" ");
			 System.out.println(c);
			 t--;	   
		   }
    }
}