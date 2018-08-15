package 剑指offer;

/**
 * 裴波那契数列 (fei bō nà qì)
 * F0=0，F1=1，FN=F(N-1)+F(N-2) N>=2
 * <p>
 * 输入  整数n   n<=39
 * 输出  裴波那契数列的第n项
 * <p>
 * 关键点  递归  迭代
 * 递归比较耗时
 */
public class Solution7 {

    //递归
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }


    //迭代
    public int Fibonacci1(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 3; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }

        return c;

    }

    public static void main(String[] args) {

        Solution7 s7 = new Solution7();


        System.out.println(s7.Fibonacci1(40));
        System.out.println(s7.Fibonacci(40));

    }
}
