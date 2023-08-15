class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            // regardless if x.exists, must increment value by 1 since found
            // only difference is if is x.exists then will get previously value/key
            // else if !x.exists then its value/key is 0, then just ++0
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);

        // since unique numbers map, populate set with map.values
        // include if statement to see if set has num from map values
        // if so then return false since not unique, else keep going
        HashSet<Integer> set = new HashSet<>();
        for (int num : map.values()) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return true;

    }
}