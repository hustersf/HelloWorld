package 剑指offer;

/**
 * 跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * <p>
 * 其实就是变形的斐波那契数列
 * <p>
 * f1=1，f2=2  fn=f(n-1)+f(n-2)
 * 举个例子，你想跳上4级台阶，只能从2级或者3级台阶跳上来
 */
public class Solution8 {


    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }

    public int JumpFloor1(int target) {
        if (target <= 2) {
            return target;
        }

        int a = 1;
        int b = 2;
        int c = a + b;
        for (int i = 4; i <= target; i++) {
            a = b;
            b = c;
            c = a + b;

        }
        return c;

    }

    public static void main(String[] args) {
        Solution8 s8=new Solution8();
        System.out.println(s8.JumpFloor(10));
        System.out.println(s8.JumpFloor1(10));

    }
}
