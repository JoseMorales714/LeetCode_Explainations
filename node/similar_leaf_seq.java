/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        // create 2 list so we can easily cmp them after
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // func(check) serves to retrieve and add leaf similar sequence
        check(left, root1);
        check(right, root2);

        return left.equals(right) ? true : false;
    }

    public void check(List<Integer> list, TreeNode root) {

        // base case
        if (root == null)
            return;

        // if true then this means has reached eof of either left or right
        // therefore have reached one of leaf seq so add to list
        // both left and right need to be null , this means reached at very bottom
        // for each respective child leaf
        if (root.left == null && root.right == null) {
            list.add(root.val);
        } else {
            System.out.println(root.val);
        }

        check(list, root.left);
        check(list, root.right);

    }
}