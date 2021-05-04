
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        /*
    recursion to count fibonacci numbers
         */
        System.out.println(fib(1, 1, 1000));
    }

    public static long fib(long s1, long s2, long max) {
        if (s1 < 0 || s2 < 0) {
            return -1;
        }
        if (s1 + s2 > max) {
            return s2;
        }
        long next = s1 + s2;
        System.out.println(s2);
        return fib(s2, next, max);
    }
    
}
