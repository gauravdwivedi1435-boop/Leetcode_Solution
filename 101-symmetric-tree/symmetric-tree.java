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
    public boolean isSymmetric(TreeNode root) {
        int[] arr= new int[1];
        arr[0]=1;
        check(root.left,root.right,arr);
        return arr[0]==1;

    }
    public static void check(TreeNode l, TreeNode r,int[] arr){
        if(l==null && r==null) return ;
        if(l==null || r==null) {
            arr[0]=0;
            return;
        }
        if(l.val!=r.val){
            arr[0]=0;
            return;
        }
        check(l.left,r.right,arr);
        check(l.right,r.left,arr);
    }
}