class Solution {
    public int findNumbers(int[] nums) {
    int c = 0 ;
    for(int i = 0; i < nums.length; i++){
        int d =  0;
        int num = nums[i];
        while(num > 0){
            num /= 10;
            d++;
        }
        if(d % 2 == 0)
        c++;
    }   
    return c;
    }
}