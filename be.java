import java.util.Scanner;
public class be {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
           for(int i=1;i<=n;i++)
           {
            
            for(int j=1;j<=(n*2)-1;j++)
              {
              
                if(i+j>=n+2&&j-i<=n-2)
                {System.out.print(" ");
                }
                else
                System.out.print("*");
                
              }

              
             
              

              System.out.println();

           }
           int z=n-1;
           int c=n-1;
           for(int k=1;k<=n-1;k++)
           {
            for(int l=1;l<=(n*2)-1;l++)
            {
                if(l+k>=z&&l+k<=(c*2)&&k<l)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
            z+=2;
           }       
    }
}
