package Solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Frank on 4/9/2016.
 */
public class Solution {

    public boolean containDuplicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        if (nums.length == 0 || nums == null){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        return hashSet.size() != nums.length;
    }

    public boolean isAnagram(String s, String t) {
        if (s == null && t == null){
            return true;
        }
        if (s.length() != t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        for (int i = 0; i <chart.length ; i++) {
            if (chars[i] == chart[i]) {
                return true;
            }else {
                return false;
            }

        }
        return false;
    }
}
