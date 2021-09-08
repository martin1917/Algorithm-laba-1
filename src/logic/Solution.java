package logic;

public class Solution {
    public int nonOptimalLiniarSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }

    public int optimalLiniarSearch(int[] arr, int target){
        int last = arr[arr.length - 1];
        arr[arr.length - 1] = target;
        
        int i = 0;
        for(; arr[i] != target; i++) {}
        
        
        arr[arr.length - 1] = last;
        return ((i != arr.length - 1) || target == last) ? i : -1;
    }

    public int liniarSearchInSortedArray(int[] arr, int target){
        int i = 0;
        while(i < arr.length && arr[i] <= target){
            if(arr[i] == target){
                return i;
            }
            i++;
        }

        return -1;
    }
}
