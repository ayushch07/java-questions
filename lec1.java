import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class lec1 {
    public static void main(String args[]) {
        
    
    Scanner sc=new Scanner(System.in);
    int marks=sc.nextInt();
    if(marks>=75)
    System.out.println("A");
    else if(marks<75&&marks>=65)
    System.out.println("B");
    else if(marks<65&&marks>=55)
    System.out.println("C");
    else if(marks<55&&marks>=45)
    System.out.println("D");
    else 
    System.out.println("Langdo is fail\n");
    int i=0;
    do{
        System.out.print("Hello moto ");
        i++;
        System.out.println( i);
    }
    while(i<10);

}
}
