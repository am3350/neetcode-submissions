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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        builds(root,sb);
        return sb.toString();
    }
    private void builds(TreeNode node,StringBuilder sb)
    {
        if(node==null)
        {
            sb.append("#,");
        }
        else
       { sb.append(node.val).append(",");
        builds(node.left,sb);
        builds(node.right,sb);}  
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
          Queue<String> nodes=new LinkedList<>(Arrays.asList(data.split(",")));
        return buildt(nodes);
    }
    private TreeNode buildt(Queue<String> nodes)
    {
        String val=nodes.poll();
        if(val.equals("#"))
        {
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(val));
        node.left=buildt(nodes);
        node.right=buildt(nodes);
        return node;
    }
    }

