import java.util.Scanner;
import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int b=0,p=1,r;
    while(n>0)
    {  r=n%2;
        b=b+r*p;
    
        p=p*10;
        n=n/2;
  
    }
    System.out.print(b);

  
        
    }
}
