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
    
        HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);

        }
        return build(preorder,0,0,inorder.length-1);

    }
        private TreeNode build(int[] preorder, int preStart,int inStart,int inEnd){
            if(inStart>inEnd)
            {
                return null;
            }
            int rootVal=preorder[preStart];
            TreeNode root=new TreeNode(rootVal);
            int rootIndex=map.get(rootVal);
            int leftSize=rootIndex-inStart;
            root.left=build(
                preorder,preStart+1,inStart,rootIndex-1
            );
root.right=build(preorder,preStart+leftSize+1,rootIndex+1,  inEnd);
            return root;
        }
        
    }

