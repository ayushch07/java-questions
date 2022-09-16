import java.util.Scanner;

public class hcf {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int divisor=60;
        int divident=36;
        while(divident%divisor!=0){
            int rem=divident%divisor;
            divident=divisor;
            divisor=rem;
        }
        System.out.println(divisor);
    }
}
