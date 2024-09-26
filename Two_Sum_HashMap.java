import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = null;
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            
            // Check if the complement exists among the values in the map
            if (map.containsValue(complement)) {
              
                // Find the key (index) corresponding to the complement value
                for (Integer key : map.keySet()) {
                    if (map.get(key) == complement) {
                        System.out.println(i + "i");
                        result = new int[]{key, i};
                        break;
                    }
                }
                break;
            }
            
            map.put(i, nums[i]);
       
        }
        
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 11, 7, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
      
    }
}
