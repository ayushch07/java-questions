import java.util.*;
public class square {
    public static void main (String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       int a2[]=new int[n];
       int s=0;
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
           s=s+arr[i];
           a2[i]=s;
          
       }
       for(int i=0;i<n;i++)
       System.out.print(a2[i]+" ");
    }
}