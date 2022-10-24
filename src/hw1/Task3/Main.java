package hw1.Task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
   /* Задание 3
    Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.

    Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию по логике:

    Если такого ключа нет, то просто добавляет данные в коллекцию.
    Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
    Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.

    Пример: есть HashMap "str1" —> 2.

    Если метод принимает "str2" —> 1, добавляем новое значение.
    Если метод принимает "str1" —> 2, кидаем исключение.
    Если метод принимает "str1" —> 5, обновляем коллекцию (теперь по ключу "str1" будет храниться значение 5).

    Критерии проверки
    Создана коллекция Map<String, Integer>.
    Коллекция Map<String, Integer> заполнена произвольными значениями.
    Создан метод, который принимает строку (ключ) и целое число (значение).
    Выполняется условие, при котором в коллекцию добавляются новые данные, если такого ключа нет.
    Выполняется условие, при котором выбрасывается исключение, если такой ключ уже есть и значения совпадают.
    Выполняется условие, при котором в коллекции обновляется целое число, если такой ключ уже есть, но значения разные.*/

    public static void main(String[] args) {

        cars.put("Volvo", 1);
        cars.put("Mercedes-Benz", 2);
        cars.put("BMW", 3);
        cars.put("Polestar", 4);
        cars.put("Acura", 1);

        System.out.println(cars);

        addCars("Honda", 2);
        addCars("Acura", 1);
        addCars("Volvo", 9);

        System.out.println(cars);

    }
    static Map<String, Integer> cars = new HashMap<>();

    public static void addCars(String string, Integer number) {
        try {
            if (Objects.equals(cars.put(string, number), number)) {
                throw new RuntimeException("Значения совпадают");
            } else {
                cars.put(string, number);
            }
        } catch (RuntimeException e) {
            System.out.println("e = " + e);
        }
    }
}
