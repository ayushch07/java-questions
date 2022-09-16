public class fibonaci {
    public static void main(String[] args){
        
        int a=0,b=1,n=10;
       // System.out.print(a);
        //System.out.println(b);
        
        for(int i=0;i<n;i++)
        {
        System.out.print(a+" ");
        
        int c=a+b;
        a=b;
        b=c;
        }
        System.out.println();
        System.out.println(a);
        System.out.println(a);


    }
}


/*#include <stdio.h>

int main()
{
    int a=0,b=1,nextint,n=10;
    printf("%d %d ", a,b);
    nextint=a+b;
    for(int i=2;i<n;i++)
    { 
        printf("%d ", nextint);
        
        a=b;
        b=nextint;
        nextint=a+b;
        
        
    }
    

    return 0;
}
 */