import java.util.Scanner;
public class decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=0,p=1,r;
        while(n>0)
        {  r=n%10;
            b=b+r*p;
        
            p=p*2;
            n=n/10;
      
        }
        System.out.print(b);
    
      
            
        }
    }
    /*
     Primitive Data types There are 8 types Data types.
     1.byte-Stores int type=>! byte=>8bits.
     2.short:-Stores int type=>2byte=>16 bit.
     3.int stoes int type=>4bytes=>32 bit.
     4.long stores int type=>8byte=>64bit.
     5.float stores decimal type 4byte=>32 bit.
     6.double stores decimal type=>8byte=>64bit.
     7.boolean stores true or false=>1 bit=>1bit.
     8. char stores a single character=>2 byte=>16 bit.
     */

