/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
    private static int dfs(TreeNode root, int maxSoFar){
        if(root == null){
            return 0;
        }

        int count = root.val >= maxSoFar? 1 : 0;
        int maxValue = Math.max(maxSoFar, root.val);
        
        count += dfs(root.left, maxValue);
        count += dfs(root.right, maxValue);

        return count;
    }
}
