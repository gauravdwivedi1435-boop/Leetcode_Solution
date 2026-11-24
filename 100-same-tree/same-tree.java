// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         int[] arr=new int[1];
//         arr[0]=1;
//         check(p,q,arr);
//         if(arr[0]==1) return true;
//         return false;
        
//     }
//     public static void check (TreeNode p,TreeNode q,int[] arr){
//         if(arr[0]==1){
//         if(p==null && q==null) return;
//         else if(p==null &&   q!=null || p!=null && q==null || p.val!=q.val){
//             arr[0]=0;
//             return;
//         }
//         if(p.val==q.val) {
//             check(p.left,p.left,arr);
//             check(p.left,p.left,arr);
//         }
//         }       


//     }
// }



class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        int[] arr = new int[1];
        arr[0] = 1;

        check(p, q, arr);

        return arr[0] == 1;
    }

    public static void check(TreeNode p, TreeNode q, int[] arr) {

        if (arr[0] == 0)
            return;

        if (p == null && q == null)
            return;

        if (p == null || q == null || p.val != q.val) {
            arr[0] = 0;
            return;
        }

        check(p.left, q.left, arr);
        check(p.right, q.right, arr);
    }
}
