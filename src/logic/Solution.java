package logic;

import java.util.List;

public class Solution {
    public int nonOptimalLiniarSearch(List<Integer> arr, int target){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == target){
                return i;
            }
        }

        return -1;
    }

    public int optimalLiniarSearch(List<Integer> arr, int target){
        int last = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        arr.add(target);
        
        int i = 0;
        for(; arr.get(i) != target; i++) {}
        
        
        arr.remove(arr.size() - 1);
        arr.add(last);
        return ((i != arr.size() - 1) || target == last) ? i : -1;
    }

    public int liniarSearchInSortedArray(List<Integer> arr, int target){
        arr.add(target + 1);

        for(int i = 0; arr.get(i) <= target; i++){
            if(arr.get(i) == target){
                arr.remove(arr.size() - 1);
                return i;
            }
        }

        arr.remove(arr.size() - 1);
        return -1;
    }
}
