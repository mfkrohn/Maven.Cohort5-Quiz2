package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    ArrayUtility arrayUtility = new ArrayUtility();
    ArrayList<Integer> testList = new ArrayList<>();
    public Boolean add(Integer i) {
        try{
        testList.add(i);}
        catch (Exception e){
            i = 0;
        }
        return contains(i);
    }

    public Integer size() {


        return testList.size();
    }

    public List<Integer> getUnique() {
        for (int i = 0; i < testList.size()-1; i++) {
            for (int j = i+1; j < testList.size()-1; j++) {
                if(testList.get(i).equals(testList.get(j))){
                    testList.remove(j);
                }
            }

        }
        return testList;
    }

    public String join() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer currentInteger: testList){
            stringBuilder.append(currentInteger);
            stringBuilder.append(", ");
        }
        stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());

        return stringBuilder.toString();
    }

    public Integer mostCommon() {



        //return arrayUtility.mostCommon(testArray);
        return testList.get(0);
    }

    public Boolean contains(Integer valueToAdd) {


        return testList.contains(valueToAdd);
    }
}
