package com.refresher;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int lengthOfLongestSubstring = 0;
        char[] charArray = s.toCharArray();
        String subString = "";
        int currLength = 0;
        for (int i = 0; i < charArray.length; i++) {
            subString = "";
            currLength = 0;
            for (int j = i; j < charArray.length; j++) {


                String str = String.valueOf(charArray[j]);

                if (subString.contains(str)) {
                    //break longest string so far
                    subString = str;

                    if (lengthOfLongestSubstring < currLength) {
                        lengthOfLongestSubstring = currLength;
                    }
                    currLength = 1;
                } else {
                    //still unique char
                    subString = subString.concat(str);
                    currLength++;
                    if (lengthOfLongestSubstring < currLength) {
                        lengthOfLongestSubstring = currLength;
                    }
                }
                System.out.println("Current string: "+subString);
            }


        }
        return lengthOfLongestSubstring;
    }

    public static int slidingWindowSubString(String s) {
        if (s.length() < 1) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int leftPointer = 0, rightPointer = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (rightPointer < s.length()) {
            if (!set.contains(s.charAt(rightPointer))) {
                set.add(s.charAt(rightPointer++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(leftPointer++));
            }
        }
        return max;
    }

}
