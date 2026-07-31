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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode[]> que = new LinkedList<>();

        que.offer(new TreeNode[]{p,q});

        while(!que.isEmpty()){
            TreeNode[] pair = que.poll();

            if(pair[0] == null && pair[1] == null){
                continue;
            }

            if(pair[0] == null || pair[1] == null || pair[0].val != pair[1].val){
                return false;
            }

            que.offer(new TreeNode[]{pair[0].left,pair[1].left});
            que.offer(new TreeNode[]{pair[0].right,pair[1].right});
        }

        return true;
    }
}
