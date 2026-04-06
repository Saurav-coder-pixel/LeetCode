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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        List<Integer> subList= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        
        if(root== null) return list;

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode currNode= q.remove();
            if(currNode== null){
                list.add(subList);
                subList= new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                subList.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        
        return list;
    }
}
