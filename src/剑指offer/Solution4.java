package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
 * 重建二叉树
 * 输入 二叉树的前序遍历和中序遍历
 * 输出 二叉树
 * 如 如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
 * <p>
 * 前序：根左右
 * 中序：左根右
 * 后序：左右根
 * <p>
 * 前+中/中+后，可以唯一确定一棵树
 */
public class Solution4 {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

    }

    /**
     * in 的分组规则，左边是左子树，右边是右子树
     * pre 的分组规则，根据in中左子树的长度，来区分左右子树
     * <p>
     * s2至i-1长度为 i-1-s2+1 = i-s2
     */
    private TreeNode reConstructBinaryTree(int[] pre, int s1, int e1, int[] in, int s2, int e2) {

        if (s1 > e1 || s2 > e2) {
            return null;
        }

        TreeNode root = new TreeNode(pre[s1]);
        for (int i = s2; i <= e2; i++) {
            if (in[i] == pre[s1]) {
                root.left = reConstructBinaryTree(pre, s1 + 1, s1 + i - s2, in, s2, i - 1);
                root.right = reConstructBinaryTree(pre, s1 + i - s2 + 1, e1, in, i + 1, e2);
            }
        }
        return root;

    }

    public static void main(String[] args) {

        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

        Solution4 s4 = new Solution4();

        TreeNode root = s4.reConstructBinaryTree(pre, in);
    }
}
