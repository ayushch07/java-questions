import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class triangle{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int c=(2*n)-1,d=n*2,e=(n*2)+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(2*n)-1;j++)
            {
                if(i+j==n+1)
                System.out.print(i);
                else if(i+j==n+2)
                System.out.print(i+1);
                else if(i+j==n+3)
                System.out.print(i+2);
                else if(i+j==2*n&&i==j)
                System.out.print((2*n)-1);
                  else 
                  System.out.print("*");
            }e=e+2;
             d=d+2;
             c=c+2;

            System.out.println();
        }
    }
}