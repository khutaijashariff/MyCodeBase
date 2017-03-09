package Algos.Trees;

/**
 * Created by ANJALI on 3/8/2017.
 */


public class TreeNode {
    //Every node in a tree holds a data and points to left and right node
  int data ;
  TreeNode left;
  TreeNode right;

TreeNode(int data)
{
    this.data=data;
    left=null;
    right=null;
}
   public void addLeft(TreeNode node)
{
    this.left=node;
}
    public void addRight(TreeNode node)
    {
        this.right=node;
    }

}
