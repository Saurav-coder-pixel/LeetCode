class Thirteen {
    public static int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
    
    public static int romanToInt(String s) {
        int total=0;
        int preValue =0;
        for(int i = s.length() - 1; i >= 0; i--){
            int current =getValue(s.charAt(i));
            
            
            if(current>= preValue){
             total= total + current;
            }else{
                total= total - current; 
            }
             preValue = current;
        }
         return total;
    }
    public static void main(String[] args){
        String s= "III";
        System.out.println(romanToInt(s));
    }
}
