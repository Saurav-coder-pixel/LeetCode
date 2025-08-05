class Solution {
    public String intToRoman(int num) {
        // HashMap <Integer, String> map= new HashMap<>();
        // map.put(1,"I");
        // map.put(5,"V");
        // map.put(10,"X");
        // map.put(50,"L");
        // map.put(100,"C");
        // map.put(500,"D");
        // map.put(1000,"M");
        int[] val= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNum= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb= new StringBuilder();

        int i=0;
        while(num>0){
            if(num>= val[i]){
                sb.append(romanNum[i]);
                num -=val[i];
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
