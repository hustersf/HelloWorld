package 剑指offer;

/**
 * 替换字符串的空格为 %20
 * limit参数，不指定的话，会舍掉末尾的空格，其它地方不会,如首部
 */
public class Solution2 {

    public String replaceSpace(StringBuffer str) {
        String[] s = str.toString().split(" ", -1);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
            if (i != s.length - 1) {
                sb.append("%20");
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "We Are Happy  ";

        Solution2 s2 = new Solution2();
        System.out.print(s2.replaceSpace(new StringBuffer(str)));


    }
}
