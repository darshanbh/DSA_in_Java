package Trees;

// import java.util.*;

// public class preOrder {
//     ArrayList<Integer> list=new ArrayList<>();
//     public List<Integer> pre_order_traversal(TreeNode root){
//         if(root==null)
//             return list;
//         list.add(root.val);
//         pre_order_traversal(root.left);
//         pre_order_traversal(root.right);
//         return list;
//     }    
// }

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class PreOrder {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        if (root == null)
            return list;

        list.add(root.val);              // visit root
        preorderTraversal(root.left);    // traverse left
        preorderTraversal(root.right);   // traverse right

        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root){
        if(root ==null)
            return list;

        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;



    }
    public static void main(String[] args) {

        // Creating a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        PreOrder obj = new PreOrder();


        List<Integer> result = obj.preorderTraversal(root);
        // List<Integer> result2=obj.inorderTraversal(root);



        System.out.println(result);
    }
}