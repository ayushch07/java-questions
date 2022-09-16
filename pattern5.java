import java.util.Scanner;
public class pattern5 {



    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n-2;
        int b=n+2;
        for(int i=0;i<n;i++)
        System.out.print(" *");
        System.out.println();
        for(int i=2;i<n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i+j==a||i+j==b)
                System.out.print(" *");
                else
                System.out.print("  ");
            }
            a++;
            b++;
            System.out.println();
        }
        for(int k=1;k<=n;k++)
        System.out.print(" *");
    }
}

