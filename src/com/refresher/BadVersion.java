package com.refresher;

import java.util.HashMap;

public class BadVersion {



    public boolean isBadVersion(int version) {
        if(version>=2)
        return true;
        else return false;
    }

    public int firstBadVersion(int n) {
        int badVersion = -1;
        if (n == 1) {
            isBadVersion(n);
        }
        return binarySearch(1, n, badVersion);

    }

    public int binarySearch(int startIndex, int endIndex, int badVersion) {
        if (startIndex>endIndex) {
            return badVersion;

        }
        int nodeIndx =startIndex +(( endIndex -startIndex)/2);
//        System.out.println("start: " + startIndex + " endIndex: " + endIndex + " Node index: " + nodeIndx);

        boolean badVersion1 = isBadVersion(nodeIndx);
        if (badVersion1) {
            endIndex = nodeIndx-1;
            badVersion = nodeIndx;
        } else  {
            startIndex = nodeIndx+1;
        }
//        else if (startIndex == nodeIndx) {
//            return badVersion;
//        }
        return binarySearch(startIndex, endIndex, badVersion);
    }
}

