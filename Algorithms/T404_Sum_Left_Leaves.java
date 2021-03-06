class Solution {    
    public int sumOfLeftLeaves(TreeNode root) {
        int res = 0;
        if(root == null) return res;
        if(root.left != null && (root.left.left == null && root.left.right == null)) res += root.left.val;
        return res + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}