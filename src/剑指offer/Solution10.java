package 剑指offer;

/**
 * 矩形覆盖
 * <p>
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * <p>
 * <p>
 * 思路
 * 摆放方式有两种，横向和竖向
 * 横向：边长占据2,则摆放取决于前面n-2
 * 竖向：边产占据1，则摆放取决于前面n-1
 * <p>
 * 到这里，我们应该明白了，这是一个跳台阶的变种题目
 */
public class Solution10 {


    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int a = 1;
        int b = 2;
        int c = -1;
        for (int i = 3; i <= target; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }


    public static void main(String[] args) {
        Solution10 s10 = new Solution10();
        System.out.println(s10.RectCover(10));

    }
}
