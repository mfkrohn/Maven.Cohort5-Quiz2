package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Router {

    TreeMap<String, String> pathController = new TreeMap<>();
    public void add(String path, String controller) {
        pathController.put(path,controller);

    }

    public Integer size() {
        return pathController.size();
    }

    public String getController(String path) {

        return pathController.get(path);
    }

    public void update(String path, String studentController) {
        pathController.put(path,studentController);
    }

    public void remove(String path) {
        pathController.remove(path);
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry thisPath : pathController.entrySet()){
             stringBuilder.append("" + thisPath.getKey() + " -> " + thisPath.getValue() + "\n");
        }
        return stringBuilder.toString();
    }
}
