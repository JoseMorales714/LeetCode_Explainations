package sliding_window;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int longestOnes(int[] nums, int k) {

        Queue<Integer> que = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        int ans = 0;

        while (i != nums.length) {
            if (nums[i] == 0) {
                que.add(i);
                // 3...4...5...
            }
            if (que.size() == k + 1) {

                System.out.println("queue-> " + que);

                j = que.remove() + 1;

                System.out.println("after remove-> " + que);
                System.out.println("j-> " + j);
            }

            ans = Math.max(i - j + 1, ans);
            // 1...2...3...3-0+1=4...4-0+1=5...5-4+1=2->5...6-4+1=3->5...7-4+1=4->5...8-4+1=5->5
            // ...9-4+1=6...
            i++;
        }
        System.out.println("fin-> " + que);
        return ans;

    }
}
