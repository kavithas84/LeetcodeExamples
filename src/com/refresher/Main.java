package com.refresher;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int resultNode = binarySearch(num, 100, 0, num.length
        );
        System.out.println("Result Node:" + resultNode);


        num = new int[]{-1, 0, 3, 5, 9, 12, 13};
        resultNode = binarySearch(num, 13, 0, num.length
        );
        System.out.println("Result Node:" + resultNode);


        num = new int[]{-1, 0, 3, 5, 9, 12};
        resultNode = binarySearch(num, 2, 0, num.length
        );
        System.out.println("Result Node:" + resultNode);


    }

    public static int binarySearch(int[] nums, int target, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1;
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
