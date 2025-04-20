package src/InorderTraversal;
public class TreeNode {
    int val;
    TreeNode root;
    TreeNode left;
    TreeNode right;
    public TreeNode(){
        this.root=null;
        this.left=null;
        this.right=null;
    }
    public TreeNode(int value){
        this.root.val=val;
        this.left=null;
        this.right=null;
    }

    public TreeNode(TreeNode root,int value,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
        this.root.val=value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", root=" + root +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
