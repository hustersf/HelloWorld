package 剑指offer;

/**
 * 变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * <p>
 * 跳台阶的变形
 * <p>
 * f1=1，f2=2，fn=f(n-1)+f(n-2)+....+f1+1
 * 举个例子 要想跳上4级台阶，可以从1级，2级，3级台阶跳上，也可以直接跳到4级
 *
 *  3级  1+2 +1 =4
 *  4级  1+2+4  +1 =8
 *  5级  1+2+4+8 +1=16
 *  6级  1+2+4+8+16 +1=32
 */
public class Solution9 {

    public int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        }

        int[] arr = new int[target];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < target; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] += arr[j];
            }
            arr[i]+=1;
        }
        return arr[target-1];


    }

    public static void main(String[] args) {
        Solution9 s9 = new Solution9();
        System.out.println(s9.JumpFloorII(6));

    }
}
