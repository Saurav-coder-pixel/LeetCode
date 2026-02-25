class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        HashMap<Character, Character> mp= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            char tCh= t.charAt(i);

            if(mp.containsKey(ch)){
                if(mp.get(ch) != tCh) return false;
            }
            else if(mp.containsValue(tCh)){
                return false;
            }
            else{
                mp.put(ch, tCh);
            }
        }
        return true;
    }
}
