package com.refresher;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSqArray {

    public int[] getSortedArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
       return nums;
    }
}
