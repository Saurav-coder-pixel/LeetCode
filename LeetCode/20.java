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
        Stack<Character> stack = new Stack<>();
        int n= s.length();

        for (int i=0; i<n; i++) {
            char ch= s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false; 
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; 
                }
            }
        }

        return stack.isEmpty();
    }
}



class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n= s.length();

        for (int i=0; i<n; i++) {
            char ch= s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false; 

                if ((ch == ')' && stack.peek()== '(') ||
                    (ch == '}' && stack.peek()== '{') ||
                    (ch == ']' && stack.peek()== '[')) {
                    stack.pop(); 
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
