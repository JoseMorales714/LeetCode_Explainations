import java.util.Map.Entry;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> hash1 = new HashSet<Integer>();
        HashSet<Integer> hash2 = new HashSet<Integer>();

        for (int ele : nums1) {
            hash1.add(ele);
        }

        for (int ele : nums2) {
            hash2.add(ele);
        }

        // at this point we just turned all the input paramets into their own 
        // hash sets
        
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        System.out.println("hash1 " + hash1);
        System.out.println("hash2 " + hash2);

        // we iterate the second hashet with each integer
        // we check if the other hashset has that integer
        // if it does not then we can add it since its distinct
        // if it does then this means one hashset already contains that ele
        // so just skip 
        
        for (int ele : hash2) {

            if (!hash1.contains(ele)) {
                l1.add(ele);
            }else{
                System.out.println("HAS: " + ele);
            }
        }
        
        System.out.println(".....");

        for (int ele : hash1) {

            if (!hash2.contains(ele)) {
                l2.add(ele);
            }else{
                System.out.println("HAS: " + ele);
            }
        }

        list.add(l2);
        list.add(l1);
        System.out.println("List1: " + l1);
        System.out.println("List2: " + l2);

        return list;
    }
}
