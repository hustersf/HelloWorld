package 剑指offer;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
 * 二叉树的镜像定义：源二叉树
 * 8
 * /  \
 * 6   10
 * / \  / \
 * 5  7 9 11
 * 镜像二叉树
 * 8
 * /  \
 * 10   6
 * / \  / \
 * 11 9 7  5
 */
public class Solution18 {

    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }


        //交换左右节点
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        Mirror(root.left);
        Mirror(root.right);

    }

    public static void main(String[] args) {

        TreeNode a1 = new TreeNode(8);
        TreeNode a2 = new TreeNode(6);
        TreeNode a3 = new TreeNode(10);
        TreeNode a4 = new TreeNode(5);
        TreeNode a5 = new TreeNode(7);
        TreeNode a6 = new TreeNode(9);
        TreeNode a7 = new TreeNode(11);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        Solution18 s18 = new Solution18();
        s18.Mirror(a1);

    }
}
