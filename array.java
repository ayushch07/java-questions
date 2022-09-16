import java.util.Scanner;
public class array{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int target=s.nextInt();
        //int j,c,k,i;

        System.out.println("enter number of elements");
          int c=0,k=0;
        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }
        
        for(int i=0;i<n;i++){
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]+arr[j]==target)
                    {
                         c=i;
                        k=j;
                    }
                }
            }

        }

        //rinting array

            System.out.print(k+" ");
            System.out.println(c);

        }


    }




