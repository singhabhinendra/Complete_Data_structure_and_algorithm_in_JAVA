import src.TreeNode;
public class InorderTraversal {
    TreeNode root;
    TreeNode left;
    TreeNode right;
    int val;
    public InorderTraversal(TreeNode root,int val,TreeNode left,TreeNode right) {
        this.root = root;
        this.val=val;
        this.left=left;
        this.right=right;
    }

    public static void main(String[] args){
        InorderTraversal inorderTraversal = new InorderTraversal(null,1,null,null);
    }


}
