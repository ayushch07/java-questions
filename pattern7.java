import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int a=n-3;
          int b=n+3;
         
           for(int i=1;i<=n;i++)
           {
            for(int j=1;j<=(n*2)-1;j++)
            {
                if(i+j==n+1||a+j==b)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
            a++;
            b+=2;
        
           }
    }
    
}
