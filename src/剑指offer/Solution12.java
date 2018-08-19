package 剑指offer;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 */
public class Solution12 {

    public double Power(double base, int exponent) {

        if (base == 0 && exponent == 0) {
            throw new IllegalArgumentException("base 和 exponet 不能同时为0");
        }

        //0的任何次方都是0
        if (base == 0) {
            return 0;
        }

        //任何数的0次方均是1
        if (exponent == 0) {
            return 1;
        }

        //取绝对值
        int n = Math.abs(exponent);
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= base;
        }

        if (exponent < 0) {
            return 1 / result;
        } else {
            return result;
        }

    }

    public static void main(String[] args) {

    }
}
