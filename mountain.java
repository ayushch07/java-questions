import java.util.Scanner;;
public class mountain {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=3;

    for(int i=1;i<=n;i++)

    { 
    
        for(int j=1;j<=(n*2)-1;j++)
        {   
           if(i+j>=m&&i+j<=(n*2)-1)
           System.out.print(" ");
           else
           System.out.print("*");
        }
        m=m+2;
        
        
        
        System.out.println();

        
    }
}
}
