package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 * 则依次打印出数字
 * 1,2,3,4   8,12,16,15  14,13,9,5   6,7,11,10.
 */
public class Solution19 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        ArrayList<Integer> list = new ArrayList<>();

        //记录位置
        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;

        while (left <= right && top <= bottom) {

            //从左到右打印,行数固定为top
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }

            //从上打下打印，列数固定为right
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }


            //从右向左打印,行数固定为bottom，top=bottom时不再重复打印
            if (bottom > top) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }

            //从下到上打印,列数固定为left，left=right时不再重复打印
            if (right > left) {
                for (int i = bottom - 1; i >= top + 1; i--) {
                    list.add(matrix[i][left]);
                }
            }

            left++;
            right--;
            top++;
            bottom--;
        }


        return list;

    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

//        int[][] matrix = {
//                {1, 2, 3, 4}
//        };

//        int[][] matrix = {
//                {1, 2},
//                {3, 4},
//                {5, 6},
//                {7, 8},
//                {9, 10}
//        };

//        int[][] matrix = {
//                {1},
//                {5},
//                {9},
//                {13}
//        };

        for (int i = 0; i < matrix.length; i++) {
            int[] arr = matrix[i];
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----------结果----------");

        Solution19 s19 = new Solution19();
        ArrayList<Integer> list = s19.printMatrix(matrix);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
