package SymmetricTree;

        import TreeNode.TreeNode;

        import java.util.Stack;

/**
 * Created by 95232 on 2017/4/24.
 */
public class Solution {
    public boolean isSym(TreeNode root){
        return root==null || isSym(root.getLeft(),root.getRight());
    }

    public boolean isSym(TreeNode left,TreeNode right){
        if(left==null || right==null)
            return left == right;
        if(left.getVal()==right.getVal())
            return false;
        return isSym(left.getLeft(),right.getRight())&&isSym(left.getRight(),right.getLeft());
    }

    public boolean isstack(TreeNode root){
        if(root == null) return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left,right;
        if(root.getLeft()!=null){
            if(root.getRight()==null)return false;
            stack.push(root.getLeft());
            stack.push(root.getRight());
        }
        else if(root.getRight()!=null) return false;
        while (!stack.isEmpty()){
            if(stack.size()%2!=0)return false;
            right=stack.pop();
            left=stack.pop();
            if(left.getLeft()!=null){
                if(right.right==null)   return false;
                stack.push(left.left);
                stack.push(right.right);
            }
            else if(right.right!=null){
                return false;
            }

            if(left.right!=null){
                if(right.left==null)   return false;
                stack.push(left.right);
                stack.push(right.left);
            }
            else if(right.left!=null) return false;
        }
        return true;
    }
}
