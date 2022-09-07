package com.refresher;

public class ReverseWordString {

    public String reverseWords(String s) {
        String[] wordArray = s.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = reverseString(wordArray[i].toCharArray());

        }
        return String.join(" ", wordArray);
    }

    public String reverseString(char[] s) {
        char tempCharBeingReplace;
        for (int i = 0; i < s.length / 2; i++) {
            tempCharBeingReplace = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tempCharBeingReplace;
        }
        return String.valueOf(s);
    }
}
