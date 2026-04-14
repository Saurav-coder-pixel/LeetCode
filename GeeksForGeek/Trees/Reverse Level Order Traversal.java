/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        Queue<Node> q= new LinkedList<>();
        Stack<Integer> st= new Stack<>();
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode= q.remove();
            if(currNode== null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                st.push(currNode.data);
                if(currNode.right!= null){
                    q.add(currNode.right);
                }
                if(currNode.left!= null){
                    q.add(currNode.left);
                }
            }
        }
        
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        
        return list;
    }
}
