package hw1.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Шварцнига Арни", "+79853056644");
        phoneBook.put("Барак Абама", "+79853056644");
        phoneBook.put("Байден Джо", "+79865256644");
        phoneBook.put("Кенеди Джон", "+79853985644");
        phoneBook.put("Сильвестр Сталлоне", "+7985301524");
        phoneBook.put("Джеймс Бьюкенен", "+7985301524");
        phoneBook.put("Джеймс Монро", "+79853056644");
        phoneBook.put("Джеймс Мэдисон", "+79853056644");
        phoneBook.put("Томас Джефферсон", "+79865256644");
        phoneBook.put("Джон Адамс", "+79853985644");
        phoneBook.put("Петров Василий", "+7989865524");
        phoneBook.put("Джордж Вашингтон", "+79325401524");
        phoneBook.put("Джон Куинси Адамс", "+79853056644");
        phoneBook.put("Эндрю Джексон", "+79853056644");
        phoneBook.put("Мартин Ван Бюрен", "+79865256644");
        phoneBook.put("Уильям Гаррисон", "+79853985644");
        phoneBook.put("Джон Тайлер", "+7985301524");
        phoneBook.put("Закари Тейлор", "+7985301524");
        phoneBook.put("Миллард Филлмор", "+79853056644");
        phoneBook.put("Франклин Пирс", "+79853056644");

        Set<String> keys = phoneBook.keySet();
        ArrayList<String> values = new ArrayList<>(phoneBook.values());

        System.out.println("phoneBook = " + phoneBook);
        System.out.println("keys = " + keys);
        System.out.println("Значения: " + values);

    }
}
