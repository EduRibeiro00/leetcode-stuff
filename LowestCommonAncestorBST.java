class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode cur = root;
        
        while (cur != null) {
            if (p.val > cur.val && q.val > cur.val)
                cur = cur.right;
            else if (p.val < cur.val && q.val < cur.val)
                cur = cur.left;
            else
                return cur;
        }
        return null;
    }
}