package com.refresher;

import java.util.*;
import java.util.stream.IntStream;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length >= k) {
            int[] rotatedOfffArray = Arrays.copyOfRange(nums, nums.length - k, nums.length);

            int[] intialArray = Arrays.copyOfRange(nums, 0, nums.length - k);
            int[] reversedArray = IntStream.concat(Arrays.stream(rotatedOfffArray), Arrays.stream(intialArray))
                    .toArray();

            for (int i = 0; i < nums.length; i++) {
                nums[i] = reversedArray[i];
            }
        }

    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int currArrayItem = nums[i];
            if (currArrayItem == 0) {
                for (int k = i + 1; k < nums.length; k++) {
                    int nextArryItem = nums[k];
                    if (nextArryItem != 0) {
                        nums[i] = nextArryItem;
                        nums[k] = 0;
                        break;
                    }
                }

            }

        }
    }

    public int[] twoSum(int[] numbers, int target) {
        Set<Integer> returnSet = new TreeSet<Integer>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    returnSet.add(i + 1);
                    returnSet.add(j + 1);
                }

            }
        }

        return returnSet.stream().mapToInt(Integer::intValue).toArray();
    }


}
