import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int row=1;
        int space=0;
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int star=b;
        while(row<=b)
        {
            int m=1;
            while(m<=space)
            System.out.println("  ");
            m++;
        }
        int k=1;
        while(k<=star)
        {
            System.out.println("*  ");
            k++;
        }
        space+=2;
        star--;
        System.out.println();
        row++;
        
        
    }
    
}
//pattern:
//* * * * *
//    * * * *
//       * * *
//          * *
//             *
        
    
    

