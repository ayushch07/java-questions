class Solution {
    public boolean isPalindrome(int x) {
        int r,b=0;
        while(x>0)
        {
            r=x%10;
            b=b*10+r;
            x=x/10;
        }
      if(x<0)
        System.out.println("False");
        else if(b==x)
        System.out.println("True");
        else
        System.out.println("False");
    }
    
}