//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// Related Topics 字符串 👍 306 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ') {
//                sb.append("%20");
//            } else {
//                sb.append(s.charAt(i));
//            }
//
//        }
//        return sb.toString();
        char[] charArray = new char[s.length()*3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                charArray[size++] = '%';
                charArray[size++] = '2';
                charArray[size++] = '0';
            } else {
                charArray[size++] = s.charAt(i);

            }

        }
        return new String(charArray, 0, size);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
