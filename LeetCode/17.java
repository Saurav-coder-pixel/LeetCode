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



//Better time complixity
class Solution {

    private List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = Map.of(
        '2',
        "abc",
        '3',
        "def",
        '4',
        "ghi",
        '5',
        "jkl",
        '6',
        "mno",
        '7',
        "pqrs",
        '8',
        "tuv",
        '9',
        "wxyz"
    );
    private String digits;

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return combinations;
        }

        this.digits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }

    private void backtrack(int index, StringBuilder path) {
        if (path.length() == digits.length()) {
            combinations.add(path.toString());
            return;
        }

        String word = letters.get(digits.charAt(index));

        for (char c : word.toCharArray()) {
            path.append(c);
            backtrack(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }

    }
}
