/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null&&q==null) {
			return true;
		}
        if(p==null||q==null){      //如果漏掉这一步，则会Runtime error，测试用例卡在[1,2]与[1,null,2]上。
            return false;
        }
        if(p.val==q.val) {
				return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }
}
