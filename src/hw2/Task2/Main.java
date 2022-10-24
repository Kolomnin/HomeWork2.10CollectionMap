package hw2.Task2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Long> linked = new LinkedHashMap<>();
        for (int i = 1; i < 11; i++) {
            linked.put("\n"+i+") Строка", Math.round(Math.random()*100));
        }
        System.out.println("linked = " + linked);
    }
}
