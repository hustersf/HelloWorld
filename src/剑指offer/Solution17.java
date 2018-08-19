package 剑指offer;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 *
 *  A树
 *        1
 *      /   \
 *    2     3
 *   /     / \
 *  4     5  6
 *
 *
 *   B树 是子结构，非子树
 *       1
 *     /   \
 *    2     3
 *   /
 *  4
 *
 *
 *   C树  是A的子树
 *       1
 *     /
 *    2
 *   /
 *  4
 *
 *  D树，是子树
 *        3
 *       / \
 *      5  6
 *
 *  注意：子结构与子树的区别
 *  子树一定是子结构
 *
 */
public class Solution17 {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //有一个为空，均返回false
        if (root1 == null || root2 == null) {
            return false;
        }

        boolean result = false;
        if (root1.val == root2.val) {
            result = childCompare(root1.left, root2.left) && childCompare(root1.right, root2.right);
        }

        if (!result && root1.left != null) {
            result = HasSubtree(root1.left, root2);
        }

        if (!result && root1.right != null) {
            result = HasSubtree(root1.right, root2);
        }

        return result;
    }

    private boolean childCompare(TreeNode c1, TreeNode c2) {
        if (c2 == null) {
            return true;
        }

        if (c1 == null && c2 != null) {
            return false;
        }

        if (c1.val != c2.val) {
            return false;
        }

        return childCompare(c1.left, c2.left) && childCompare(c1.right, c2.right);
    }

    public static void main(String[] args) {

        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a3.left = a5;
        a3.right = a6;

        TreeNode b1 = new TreeNode(1);
        TreeNode b2 = new TreeNode(2);
        TreeNode b3 = new TreeNode(3);
        TreeNode b4 = new TreeNode(4);
        b1.left = b2;
        b1.right = b3;
        b2.left = b4;


        Solution17 s17 = new Solution17();

        System.out.println(s17.HasSubtree(a1, b1));

    }
}
