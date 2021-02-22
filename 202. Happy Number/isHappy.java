/*
 * Tag: Math
 * Difficulty: Easy
 */
 
 class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> nums = new HashSet<Integer>();//to check if it returns duplicates
        nums.add(n);
        
        while(n != 1){
            int sum = 0;//a new integer to sum up
            for(int i = n; i != 0; i = i/10){//i = i/10
                sum += Math.pow(i%10, 2);//i%10
            }
            
            if(nums.contains(sum)){
                return false;
            }
            nums.add(sum);//add to nums to check duplicates
            n = sum;
        }
        
        return true;
    }
}
