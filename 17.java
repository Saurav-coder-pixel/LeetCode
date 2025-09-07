class Solution {
    public static String[] keypad= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits== null || digits.length()== 0){
            return result;
        }

        backtrack(digits, 0, "", result);
        return result;
    }

    private void backtrack(String digits, int idx, String combination, List<String> result){
        if(idx==digits.length()){
            result.add(combination);
            return;
        }

        char currChar= digits.charAt(idx);
        String mapping =keypad[currChar- '0'];

        for(int i=0; i<mapping.length(); i++){
            backtrack(digits, idx+1, combination+ mapping.charAt(i), result);
        }
    }
}
