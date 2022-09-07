package com.refresher;

import java.util.ArrayList;
import java.util.List;

public class PerfectSqSum {

    public int numSquares(int n) {
        int leastNumOfsquare = 0;
        List<Integer> listOfPerfectSq = getListOfPerfectSq(n);
        int numberToBeBroken = n;
//        listOfPerfectSq.remove(new Integer(numberToBeBroken));
        if(listOfPerfectSq.contains(n)){
            //least sum is itself
            return 1;
        }
        while (!listOfPerfectSq.isEmpty()) {

            int curreCount = breakDownNumber(listOfPerfectSq, numberToBeBroken, 0);
            if (leastNumOfsquare == 0 || curreCount < leastNumOfsquare) {
                leastNumOfsquare = curreCount;
            }
            Integer remove = listOfPerfectSq.remove(0);
            System.out.println("Iteration round "+remove.intValue()+"returned count "+ leastNumOfsquare);
        }

        return leastNumOfsquare;

    }

    private int breakDownNumber(List<Integer> listOfPerfectSq, int numberToBeBroken, int countOfSqs) {
        int leastNoOfSq = 0;
        for (int i = 0; i < listOfPerfectSq.size(); i++) {

            Integer integer = listOfPerfectSq.get(i);
            if (numberToBeBroken >=integer.intValue()) {
                int difference = numberToBeBroken - integer;
                countOfSqs++;
                if (difference > 0) {
                    //check if this differnce is contained in the list
                    if (listOfPerfectSq.contains(difference)) {
                        countOfSqs++;
                        return countOfSqs;

                    } else {
                        //breakdwon difference
                        return breakDownNumber(listOfPerfectSq, difference, countOfSqs);
                    }
                } else
                    continue;
            }
        }
        return leastNoOfSq;
    }

    private List<Integer> getListOfPerfectSq(int n) {

        List<Integer> listOfPerfectSq = new ArrayList<Integer>();
        if (n > 0 && n <= 10000) {
            while (n > 0) {
                Double checkIsPerfectSQ = Math.sqrt(n);
//                System.out.println(checkIsPerfectSQ);
                if ((checkIsPerfectSQ % 1) == 0) {
                    //isperfect sq, add it to the list
                    listOfPerfectSq.add(n);
                }
                n--;
            }
        }

        return listOfPerfectSq;
    }


}

