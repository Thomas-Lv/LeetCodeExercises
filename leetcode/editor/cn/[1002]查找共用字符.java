//给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答
//案。
// 
//
// 示例 1： 
//
// 
//输入：words = ["bella","label","roller"]
//输出：["e","l","l"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["cool","lock","cook"]
//输出：["c","o"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 100 
// words[i] 由小写英文字母组成 
// 
// Related Topics 数组 哈希表 字符串 👍 275 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] result = new int[26];
        if (words.length == 0) {
            return list;
        }
        for (int i = 0; i < words[0].length(); i++) {
            result[words[0].charAt(i) - 'a'] += 1;
        }

        for (int i = 1; i < words.length; i++) {
            int[] otherResult = new int[26];
            for (int j = 0 ; j < words[i].length(); j++) {
                otherResult[words[i].charAt(j) - 'a'] += 1;
            }
            for (int q = 0; q < 26; q++){
                result[q] = Math.min(result[q], otherResult[q]);

            }

        }
        for (int i = 0; i < 26; i++) {
            while (result[i] !=0) {
                char c = (char) (i + 'a');
                list.add(String.valueOf(c));
                result[i]--;
            }
        }
        return list;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
