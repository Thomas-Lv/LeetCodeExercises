//给你一个字符串 s ，颠倒字符串中 单词 的顺序。 
//
// 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。 
//
// 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。 
//
// 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "the sky is blue"
//输出："blue is sky the"
// 
//
// 示例 2： 
//
// 
//输入：s = "  hello world  "
//输出："world hello"
//解释：颠倒后的字符串中不能存在前导空格和尾随空格。
// 
//
// 示例 3： 
//
// 
//输入：s = "a good   example"
//输出："example good a"
//解释：如果两个单词间有多余的空格，颠倒后的字符串需要将单词间的空格减少到仅有一个。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 包含英文大小写字母、数字和空格 ' ' 
// s 中 至少存在一个 单词 
// 
//
// 
// 
//
// 
//
// 进阶：如果字符串在你使用的编程语言中是一种可变数据类型，请尝试使用 O(1) 额外空间复杂度的 原地 解法。 
// Related Topics 双指针 字符串 👍 585 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
//        List<String> stringList = Arrays.asList(s.trim().split("\\s+"));
//        Collections.reverse(stringList);
//        return String.join(" ", stringList);
//        s = s.trim();
//        // 正则匹配连续的空白字符作为分隔符分割
//        List<String> wordList = Arrays.asList(s.split(" "));
//        Collections.reverse(wordList);
//        return String.join(" ", wordList);

        // 去掉首尾空格
        // 反转字符串并去掉中间多余空格
        // 反转单词
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        // 去掉两端空格
        while(left <= right && chars[left] == ' ') {
            left++;
        }
        while(left <= right && chars[right] == ' ') {
            right--;
        }
        // 去掉中间空格
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            if (chars[left] != ' ') {
                sb.append(chars[left]);
            } else if (sb.charAt(sb.length() -1) != ' ') {
                sb.append(chars[left]);
            }
            left++;
        }

        // 反转字符串
        reverse(sb, 0, sb.length() - 1);

        // 反转单词
        int l = 0;
        int r = sb.length()-1;
        int m = 0;
        while (l <= r) {
            while (m <= r && sb.charAt(m) != ' ') {
                m++;
            }
            reverse(sb, l, m-1);
            l = m + 1;
            m++;
        }

        return sb.toString();

    }

    private void reverse(StringBuilder sb, int l, int r) {
        while (l <= r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
