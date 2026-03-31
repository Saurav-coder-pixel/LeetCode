class Solution {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        int v1 , v2;
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i].equals("+") || arr[i].equals("-") || arr[i].equals("*") || arr[i].equals("/") || arr[i].equals("^")){
                
                v2= st.pop();
                v1= st.pop();
                
                 if(arr[i].equals("+")) st.push(v1 + v2);  
                if(arr[i].equals("-")) st.push(v1 - v2);  
                if(arr[i].equals("*")) st.push(v1 * v2);  
                if(arr[i].equals("/")) st.push((int) Math.floor((double)v1 / v2));  
                if(arr[i].equals("^")) st.push((int) Math.pow(v1, v2));
                
            }else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        
        return st.pop();
    }
}
