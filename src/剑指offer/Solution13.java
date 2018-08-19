package 剑指offer;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * <p>
 * 输入：1，6，4，5，2，7，9
 * 输出：1，5，7，9，6，4，2
 * <p>
 * 思考
 * 遍历数组将偶数都取出来，直到数组中只剩下奇数
 * 将取出来的偶数按照顺序，放到奇数数组的末尾
 */
public class Solution13 {


    public void reOrderArray(int[] array) {

        // 用空间换时间
        int[] ood = new int[array.length];
        int[] even = new int[array.length];

        int oddNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even[i] = array[i];
            } else {
                ood[i] = array[i];
                oddNum++;
            }
        }

        //奇数放前面
        int oddIndex = 0;
        for (int i = 0; i < ood.length; i++) {
            if (ood[i] != 0) {
                array[oddIndex++] = ood[i];
            }
        }


        //偶数放后面
        int evenIndex = oddNum;
        for (int i = 0; i < even.length; i++) {
            if (even[i] != 0) {
                array[evenIndex++] = even[i];
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 5, 2, 7, 9};

        Solution13 s13 = new Solution13();
        s13.reOrderArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
