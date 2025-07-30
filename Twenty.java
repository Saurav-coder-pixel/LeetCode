class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map= new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack= new Stack<>();

        for(char c: s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }else if(map.containsKey(c)){
                if(stack.isEmpty() || map.get(c) != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


// best time complixity
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);
            }

            else {
                if (st.isEmpty()) return false;
                char top = st.peek();
            if((ch==']'&&top=='[')||(ch=='}'&&top=='{')||(ch==')'&&top=='(')){
                st.pop();
            }else{
                return false;
            }

            }
        }

        return st.isEmpty();
    }
}
