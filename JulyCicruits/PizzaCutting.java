import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T-->0){
            long N = scn.nextLong();
            System.out.println(cutMaximum(N));
        }
    }
    public static long cutMaximum(long n){
        return 1 + n * (n + 1) / 2;
    }
}
