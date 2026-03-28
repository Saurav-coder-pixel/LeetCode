class Solution {
    public boolean isPalindrome(int x) {
        if(x< 0 ||(x%10== 0 && x!= 0)) return false;

        int revHalf= 0;

        while(x> revHalf){
            revHalf= revHalf*10 + x%10;
            x= x/10;
        }

        return (x== revHalf || x== revHalf/10);
    }
}




class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;   // negative numbers are not palindrome
        
        String str = Integer.toString(x);
        String rev = new StringBuilder(str).reverse().toString();
        
        return str.equals(rev);
    }
}
