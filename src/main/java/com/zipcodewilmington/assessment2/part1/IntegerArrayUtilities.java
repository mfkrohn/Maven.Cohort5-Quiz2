package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length%2 == 0;
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> listToHoldRange = new ArrayList<>();
        for (int i = start; i <= (stop); i++) {
            listToHoldRange.add(i);
        }
        return listToHoldRange.toArray(new Integer[stop-start]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0]*array[1];
    }
}
