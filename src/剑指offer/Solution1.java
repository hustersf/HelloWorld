package 剑指offer;


/**
 * 二维数组中查找值
 */
public class Solution1 {

    public boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int target = 5;

        Solution1 s1 = new Solution1();

        System.out.print(s1.Find(target, array));

    }


}
