import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int find=sc.nextInt();
         int l=0,h=n-1;
         int mid=(l+h)/2;
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
          for(int j=0;j<n;j++)
          System.out.print(arr[j]+" ");
          System.out.println();
        
          while(h>=l)
          {
             if(arr[mid]==find)
               {System.out.println("found at position-"+ mid);
               break;
            }
               else if(arr[mid]<find)
                {
                     l=mid+1;
                     mid=(l+h)/2;
               }
               else 
               {
                h=mid-1;
               mid=(l+h)/2;
            }
               
          }
        
        
        
    }
}
