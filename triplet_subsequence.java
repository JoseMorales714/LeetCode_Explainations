class Solution {
    public boolean increasingTriplet(int[] nums) {

        int passes_less = 0;
        for(int ix = 0; ix < nums.length - 1; ix++){

            for(int iy = 0; iy < nums.length - 1; iy++){
                
            }



            if(nums[ix] < nums[ix + 1]){
                passes_less++;

                if(passes_less == 3){
                    return true;
                }
            }
        }
        return false;
    }
}