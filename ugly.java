import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ugly {
    // public static boolean ugl(int n)
    // {    int i=0,f=0,g=0,h=0;
    
    //       while(n>1)
    //       {    
    //           if(n%i==0)
    //           {
                  
    //                n=n/i;
    //             }
    //         //    if(i==2)
    //         //       f++;
                  
    //         //    if(i==3)
    //         //    g++;
               
    //         //    if(i==5)
    //         //       h++;
              
    //         //   i++;
    //       }
    //       if(f<=1&&g<=1&&h<=1)
    //         return true;
    //         else 
    //         return false;
         
              
    // }
    public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int l=0,f=0,g=0,b=0;

            while(n>1)
            {
                
            if(n%2==0)
            {
                f++;
                n=n/2;
            }
                else if(n%5==0)
                {
                    g++;
                    n=n/5;
                }
                else if(n%3==0)
                {
                    l++;
                    n=n/3;
                }
                else
                 {b=1; 
                break;}
            
                
                }
              
                 if(b==1)
                System.out.println("false");
                else if(l>1||f>1||g>1)
                System.out.println("true");
                else if(l<=1&&f<=1&&g<=1)
                System.out.println("True");
                else 
                System.out.println("false");

           
            

        
    }
            
    }


