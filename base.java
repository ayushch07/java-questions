import java.util.Scanner;
import java.util.Scanner;
public class base {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b=0,p=1,r;
    while(n>0)
    {  r=n%6;
        b=b+r*p;
    
        p=p*10;
        n=n/6;
  
    }
    System.out.print(b);

  
        
    }
}
