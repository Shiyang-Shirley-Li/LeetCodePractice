/*
 * Tag: HashTable
 * Difficulty: Easy
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();
        
        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);
        
        if(new String(sCharArr).equals(new String(tCharArr))){
            return true;
        }
        
        return false;
    }
}

/*
 * Conclusion: 1. toCharArray(); 2. Arrays.sort(); 3. new
 *
 */
