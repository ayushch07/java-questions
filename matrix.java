import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=1,b=2,f=4,q=3;
        int arr[][]={
            {1,2,3,4},
            {4,5,6,8},
            {7,8,9,10},{
                11,12,13,14
            }
        };
        for(int i=0;i<4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(c+j>=2||c+j<=5)
                System.out.print(arr[i][j]+" ");
                else if(b+j==6||q+j==7)
                System.out.print(arr[i][j]);
                  else if(f+j>=5||f+j<=8)
                  System.out.print(arr[i][j]+" ");
                  else if(q+j==4)
                  System.out.print(arr[i][j]+" ");
                  else if(b+j==3)
                  System.out.print(arr[i][j]+" ");
                  else if(i==j||b+j==5||q+j==5)
                  System.out.print(arr[i][j]+" ");


            }
        }       
    }
    
}
