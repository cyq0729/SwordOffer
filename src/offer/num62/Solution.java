package offer.num62;

/**
 * Created by meitu on 2017/7/7.
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {

    int index = -1;
    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder("");
        if(root == null){
            sb.append("$,");
            return sb.toString();
        }else{
            sb.append(root.val).append(",");
            sb.append(Serialize(root.left));
            sb.append(Serialize(root.right));
            return sb.toString();
        }
    }
    TreeNode Deserialize(String str) {
        index++;
        int length = str.length();
        if(index >= length){
            return null;
        }
        String[] strr = str.split(",");
        TreeNode node = null;
        if(!strr[index].equals("$")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }

        return node;
    }
}
