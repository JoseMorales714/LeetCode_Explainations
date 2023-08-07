class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int size = candies.length;
        List<Boolean> result = new ArrayList<>();

        int max = 0;

        // finds max within the given array
        for (int iy = 0; iy < size; iy++) {
            if (candies[iy] > max) {
                max = candies[iy];
            }
        }

        // this for loops attempts to add extra candies to each ix index
        for (int ix = 0; ix < size; ix++) {
            int num = candies[ix] + extraCandies;

            // if after the candies is added, check if its greater than the previous max
            if (num >= max) {
                System.out.println("ans-> " + num + "ix >= " + max + " TRUE");
                result.add(true);
            } else {
                System.out.println("ans-> " + num + "ix < " + max + " FALSE");
                result.add(false);
            }
        }

        return result;

    }
}