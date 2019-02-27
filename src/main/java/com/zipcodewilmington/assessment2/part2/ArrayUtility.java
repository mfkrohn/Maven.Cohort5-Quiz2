package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> mergedList = new ArrayList();
        for(Integer numberToAdd : array1){
            mergedList.add(numberToAdd);
        }
        for(Integer numberToAdd : array2){
            mergedList.add(numberToAdd);
        }
        return mergedList.toArray(new Integer[array1.length + array2.length]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        ArrayList<Integer> inputList = new ArrayList<>();
        for(Integer numberToAdd : array){
            inputList.add(numberToAdd);
        }
        for(int i = 0; i < index; i++){
            inputList.add(inputList.get(0));
            inputList.remove(0);
        }
        return inputList.toArray(new Integer[array.length]);
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer[] mergedInput = merge(array1,array2);
        Integer numberOfOccurences = 0;
        for(Integer checker:mergedInput){
            if(checker == valueToEvaluate){
                numberOfOccurences++;
            }
        }

        return numberOfOccurences;
    }

    public Integer mostCommon(Integer[] array) {
        Integer greatestOccurences = 0;
        Integer last = 0;
        for(Integer number : array){
            if(countOccurrence(array,new Integer[0],number)>last){
                greatestOccurences = number;
            }
        }

        return greatestOccurences;
    }
}
