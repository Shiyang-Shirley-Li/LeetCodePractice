/*
 * Tag: Math
 * Difficulty:  Easy
 */
 
 class Solution {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> alphaNum = new HashMap<Character, Integer>();
        alphaNum.put('A', 1);
        for(int i = 1; i < 26; i++){
            int acsii = 'A' + i;
            //System.out.println((char)(66));
            alphaNum.put((char)(acsii), 1+i);
        }
        
        int num = 0;
        int digit = s.length()-1;
        for(int j = 0; j < s.length(); j++){
            num += alphaNum.get(s.charAt(j)) *  (Math.pow(26, digit));
            digit--;
        }
        return num;
    }
}
