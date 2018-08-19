package 剑指offer;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class Solution11 {

    public int NumberOf1(int n) {

        String s = Integer.toBinaryString(n);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        Solution11 s11 = new Solution11();
        System.out.println(s11.NumberOf1(4));

    }
}
