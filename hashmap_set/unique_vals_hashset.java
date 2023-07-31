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

        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        System.out.println("hash1 " + hash1);
        System.out.println("hash2 " + hash2);

        for (int ele : hash2) {

            if (!hash1.contains(ele)) {
                l1.add(ele);
            }
        }

        for (int ele : hash1) {

            if (!hash2.contains(ele)) {
                l2.add(ele);
            }
        }

        list.add(l2);
        list.add(l1);

        return list;
    }
}