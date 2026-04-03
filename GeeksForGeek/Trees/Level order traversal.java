/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        if(root== null){
            return new ArrayList<>();
        }
        Queue<Node> q= new LinkedList<>();
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        ArrayList<Integer> level= new ArrayList<>();
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode= q.remove();
            
            if(currNode== null){
                list.add(level);
                level= new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                level.add(currNode.data);
                
                if(currNode.left!= null){
                    q.add(currNode.left);
                }
                if(currNode.right!= null){
                    q.add(currNode.right);
                }
            }
        }
        return list;
    }
}