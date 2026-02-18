class Solution {
    public HashMap<Character, Integer> hashMap(String str){
        HashMap<Character, Integer> mp= new HashMap<>();

        for(int i= 0; i< str.length(); i++){
            Character ch= str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }else{
                int currKey= mp.get(ch);
                mp.put(ch, currKey+ 1);
            }
        }
        return mp;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> mp1= hashMap(s);
        HashMap<Character, Integer> mp2= hashMap(t);

        return mp1.equals(mp2);
    }
}
