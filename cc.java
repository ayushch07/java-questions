import java.util.Scanner;
public class cc {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        //  char strArr[] = a.toCharArray();
        // for(int i=0;i<strArr.length;i++)
        // {
        if(a>='a'&&a<='z')
        System.out.println("lowercase");
        else if(a>='A'&&a<='Z')
        System.out.println("UPPERCASE");
        else
        System.out.println("Invalid");
        

    }
}