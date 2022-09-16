import java.util.Scanner;
public class upper {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
    int n,i;
    char c;
    String z="";
    for(i=0;i<str.length();i++)
    {
        c=str.charAt(i);
        if(c>=97&&c<=122)
        {n=c-32;
        c=(char)n;}
        else if(c>='A'&&c<='Z')
        {n=c+32;
            c=(char)n;}
        z=z+c;
    }
    System.out.println(z);
    
}
}
