//给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4]
//解释：[4,9] 也是可通过的
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums1.length, nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 1000 
// 
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 557 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int n : nums1) {
            a.add(n);
        }
        for (int m : nums2) {
            if (a.contains(m)) {
                b.add(m);
            }
        }
        int[] r = new int[b.size()];
//        Integer[] result = new Integer[b.size()];
//        b.toArray(result);
//        for (int i=0; i<result.length; i++) {
//            r[i] = result[i];
//        }
        int index = 0;
        for (int v : b) {
            r[index++] = v;
        }
        return r;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
