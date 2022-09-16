import java.util.*;
public class max {
    public static void main(String args[]) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
        
          for(int i=0;i<n;i++)
          {
              arr[i]=sc.nextInt();
          }
           for(int i=1;i<n;i++)
           {
               if(arr[0]<arr[i])
               arr[0]=arr[i];
           }
           System.out.println(arr[0]);
    } 
}