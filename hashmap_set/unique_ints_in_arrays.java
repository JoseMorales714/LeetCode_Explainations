class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> r_l1 = new ArrayList<Integer>();
        int ecx = 0;

        while(r_l1.size() < 3){ // stops at 2 since less than 3 most
            if(nums1[ecx] != nums2[ecx]){
                r_l1.add(nums[ecx]);
            }



            ecx++;
        }

        return r_l1;
    }
}