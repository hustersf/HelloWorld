package 剑指offer;

/**
 * 数组旋转,把一个数组最开始的若干个元素搬到数组的末尾
 * 输入 非递减排序的数组的一个旋转
 * 输出 旋转数组的最小元素
 * <p>
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1
 * 给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Solution6 {

    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]<array[i]){
                return array[i+1];
            }
        }
        //数组中的元素全相等
        return array[0];

    }

    public static void main(String[] args) {
        int[] arr={3,4,5,6,1,2};
        Solution6 s6=new Solution6();
        System.out.println(s6.minNumberInRotateArray(arr));

    }
}
