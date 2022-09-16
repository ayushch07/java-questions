import java.time.LocalTime;

import javax.management.openmbean.ArrayType;

public class check {
    public static void main(String[] args) {
        System.out.println(18>17);
        // boolean is=18==18;
        int a[]=new int[3];
        try
        {System.out.println(a[4]);}
        catch(ArrayIndexOutOfBoundsException b)
        {
            System.out.println("Error is there");
            System.out.println(b.getLocalizedMessage());
        }
        System.out.println("Hello guys");

    }
    
}
/*
 try
        {System.out.println(2/0);}
        catch(Exception b)
        {
            System.out.println("Error is there");
            System.out.println(b.getLocalizedMessage());
        }
        System.out.println("Hello guys");
 */
