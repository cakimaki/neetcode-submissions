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
    public boolean isBalanced(TreeNode root) {
        return bfs(root)[0] == 1;
    }

    private static int[] bfs(TreeNode root){
        if(root == null){
            return new int[]{1,0};
        }

        int[] left = bfs(root.left);
        int[] right = bfs(root.right);

        boolean balanced = left[0] == 1 && right[0] == 1 && Math.abs(left[1]-right[1])<=1;
        int height = Math.max(left[1],right[1]);
        
        return new int[]{balanced? 1 : 0,height + 1};
        
    }

    
}
