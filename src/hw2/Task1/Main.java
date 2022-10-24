package hw2.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        addListMap();
        changeListMap();
    }
    static Map<String, List<Integer>> listMap = new HashMap<>();
    public static void addListMap() {
        for (int i = 1; i < 6; i++) {
            listMap.put("\n"+i+" Список ", List.of((int) Math.round(Math.random()*1000),
                                                   (int) Math.round(Math.random()*1000),
                                                   (int) Math.round(Math.random()*1000)));
        }
        System.out.println(""+listMap);
    }
    public static Map<String, List<Integer>> getListMap() {
        return listMap;
    }
    public static void changeListMap() {
        Map<String, List<Integer>> change = new HashMap<>();
            for (Map.Entry<String, List<Integer>> entry : getListMap().entrySet()) {
                change.put(entry.getKey(), Collections.singletonList(entry.getValue().get(0) +
                                                                     entry.getValue().get(1) +
                                                                     entry.getValue().get(2)));
        }
        System.out.println(change);
    }
}
