package com.refresher;

import java.util.LinkedList;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
       return  binarySearch(nums,target,0,nums.length-1);
    }

    public static int binarySearch(int[] nums, int target, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return startIndex;
        }
        int nodeIndx = (startIndex + endIndex) / 2;
        System.out.println("start: " + startIndex + " endIndex: " + endIndex + " Node index: " + nodeIndx);

        if (nums[nodeIndx] == target) {
            return nodeIndx;
        } else if (nums[nodeIndx] > target) {
            endIndex = nodeIndx - 1;
        } else if (nums[nodeIndx] < target) {
            startIndex = nodeIndx + 1;
        }

        return binarySearch(nums, target, startIndex, endIndex);


    }
}
