package test;

import com.refresher.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    int[] nums;
    int[] nums1;
    int[] nums2;
    int[] nums3;
    int[] nums4;

    @BeforeEach
    void setUp() {
        nums = new int[]{-111, -2, 3, 4, 5, 7, 8, 9};
        nums1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 12, 22, 33};
        nums2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 12};
        nums3 = new int[]{1};
        nums4 = new int[]{};

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void binarySearch1() {
        int length = nums.length;
        int index = Main.binarySearch(nums, 8, 0, length);
        assertEquals(8, index);
    }

    @Test
    void binarySearch2() {
        int index = Main.binarySearch(nums, 9, 0, nums.length - 1);
        assertEquals(9, index);
    }

    @Test
    void binarySearch3() {
        int index = Main.binarySearch(nums, 10, 0, nums.length);
        assertEquals(10, index);
    }

    @Test
    void binarySearch4() {
        int index = Main.binarySearch(nums, 1, 0, nums.length);
        assertEquals(1, index);
    }

    @Test
    void binarySearch5() {
        int index = Main.binarySearch(nums, 0, 0, nums.length);
        assertEquals(0, index);
    }

    @Test
    void binarySearch6() {
        int index = Main.binarySearch(nums1, 8, 0, nums.length);
        assertEquals(8, index);
    }

    @Test
    void binarySearch7() {
        int index = Main.binarySearch(nums1, 9, 0, nums.length);
        assertEquals(9, index);
    }

    @Test
    void binarySearch8() {
        int index = Main.binarySearch(nums1, 10, 0, nums.length);
        assertEquals(10, index);
    }

    @Test
    void binarySearch9() {
        int index = Main.binarySearch(nums1, 1, 0, nums1.length);
        assertEquals(1, index);
    }

    @Test
    void binarySearch10() {
        int index = Main.binarySearch(nums1, 0, 0, nums1.length);
        assertEquals(0, index);
    }

    @Test
    void binarySearch11() {
        int index = Main.binarySearch(nums2, 8, 0, nums.length);
        assertEquals(8, index);
    }

    @Test
    void binarySearch12() {
        int index = Main.binarySearch(nums2, 9, 0, nums.length);
        assertEquals(9, index);
    }

    @Test
    void binarySearch13() {
        int index = Main.binarySearch(nums2, 10, 0, nums.length);
        assertEquals(10, index);
    }

    @Test
    void binarySearch14() {
        int index = Main.binarySearch(nums2, 1, 0, nums.length);
        assertEquals(1, index);
    }

    @Test
    void binarySearch15() {
        int index = Main.binarySearch(nums2, 0, 0, nums.length);
        assertEquals(0, index);
    }

    @Test
    void binarySearch16() {
        int index = Main.binarySearch(nums3, 8, 0, nums.length);
        assertEquals(8, index);
    }

    @Test
    void binarySearch17() {
        int index = Main.binarySearch(nums3, 9, 0, nums.length);
        assertEquals(9, index);
    }

    @Test
    void binarySearch18() {
        int index = Main.binarySearch(nums3, 10, 0, nums.length);
        assertEquals(10, index);
    }

    @Test
    void binarySearch19() {
        int index = Main.binarySearch(nums3, 1, 0, nums.length);
        assertEquals(1, index);
    }

    @Test
    void binarySearch22() {
        int index = Main.binarySearch(nums3, 3, 0, nums.length);
        assertEquals(3, index);
    }

    @Test
    void binarySearch26() {
        nums = new int[]{-7, -3, 2, 3, 11};
        int[] index = new SortedSqArray().getSortedArray(nums);
        System.out.println(index);
//        assertEquals(3, index);
    }

    @Test
    void binarySearch20() {
        nums = new int[]{1, 2, 3, 4, 5, 7, 8, 9};
        int index = new SearchInsert().searchInsert(nums, 5);
        assertEquals(4, index);
        nums = new int[]{1, 2, 3, 4, 5, 7, 8, 9};
        index = new SearchInsert().searchInsert(nums, 6);
        assertEquals(5, index);
        nums = new int[]{1, 2, 3, 4, 5, 7, 8, 9};
        index = new SearchInsert().searchInsert(nums, 10);
        assertEquals(8, index);
        nums = new int[]{1, 2, 3, 4, 5, 7, 8, 9};
        index = new SearchInsert().searchInsert(nums, 16);
        assertEquals(8, index);
        nums = new int[]{2, 3, 4, 5, 7, 8, 9};
        index = new SearchInsert().searchInsert(nums, 1);
        assertEquals(0, index);
    }

    @Test
    void binarySearch202() {
        nums = new int[]{-2
        };
        new RotateArray().rotate(nums, 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " , ");
        }
    }

    @Test
    void binarySearch203() {
        nums = new int[]{0, 0, 1, 0, 3, 12, 0};
        new RotateArray().moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " , ");
        }
    }

    @Test
    void twoSum() throws IOException {
//        Properties properties = new Properties();
//        InputStream inputStream = getClass().getResourceAsStream("/testData.prop");
//        properties.load(inputStream);
        nums = new int[]{};
        int[] returnArray = new RotateArray().twoSum(nums, 5);
        for (int i = 0; i < returnArray.length; i++) {
            System.out.println(returnArray[i] + " , ");
        }
    }

    @Test
    void testReverseString() {
        char[] stringChar = {'a', 'b', 'c', 'd', 'e'};
        new ReverseString().reverseString(stringChar);
        for (int i = 0; i < stringChar.length; i++) {
            System.out.println(stringChar[i] + " , ");
        }

    }

    @Test
    void testReverseWordString() {
        String testString = "Let's take LeetCode contest";
        String output = new ReverseWordString().reverseWords(testString);
        System.out.println(output);
        assertEquals("s'teL ekat edoCteeL tsetnoc", output);

    }

    @Test
    void testLongestSubstring() {
        String testString = "asjrgapa";
        System.out.println(new LongestSubString().lengthOfLongestSubstring(testString));
    }


}