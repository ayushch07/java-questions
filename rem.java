import java.util.Scanner;
public class rem {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            long n=sc.nextLong();
             long p=n,r=0,c=0,j,i;
              
            while(p>0)
            {
                  c++;
                  p=p/10;
            }
            long arr[]=new long[c];
            i=c-1;
            while(n>0)
            {
                   r=n%10;
                   arr[i]=r;
                   i--;
                   n=n/10;
            }
            for(j=c-1;j>=0;j--)
            {
                  if(9-arr[j]<arr[j]&&9-arr[j]!=0)
                  arr[j]=9-arr[j];

            }
       for(j=0;j<c;j++)
       System.out.print(arr[j]);            


    }
}
