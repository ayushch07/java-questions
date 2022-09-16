public class number {
    public static void main(String[] args) {
        byte b=(byte)127;
        int i=20;
        short s=25;
        b=(byte)(i);
        long l=10;
        System.out.println(b);
        l=s;
        l=1000000000;//if one 0 added then out of range.
        System.out.println(l);


    }
}
