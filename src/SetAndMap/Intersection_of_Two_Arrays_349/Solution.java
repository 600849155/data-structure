package SetAndMap.Intersection_of_Two_Arrays_349;

import java.util.ArrayList;
import java.util.TreeSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer>set = new TreeSet<>();
        for (int num : nums1){
            set.add(num);
        }

        ArrayList<Integer>list = new ArrayList<>();

        for (int num : nums2){
            if (set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }

        int re[ ] = new int[list.size()];
        for (int i = 0;i < list.size();i ++){
            re[i] = list.get(i);
        }

        return re;
    }
}