
// https://github.com/Elijah126Klim/Seminar_6_Java

// import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
        public static void main(String[] args) {
    // Создаем экз-р HashMap для хранения имен и списков телефонов
    Map<String, List<String>> phoneDirectory = Map.of("Петр", List.of("+7 925-000-11-11"),"Олег", List.of("+7 999-123-45-45", "555"),
                                                "Джон", List.of("(123)123-45-47", "(123)555-55-00", "12345"), "Оля", List.of("0101"));

        System.out.println(sorted(phoneDirectory));
    }

            // Не получается устранить дубликат ключа
    // private static void phoneBook(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
    //     if (!phoneBook.containsKey(name)) {
    //     phoneBook.put(name, new ArrayList<>());
    //     }

    //     phoneBook.get(name).add(phoneNumber);
    // }

    // Объявлем публичный статический метод с имнем sort, который принимает на вход
    // объект типа Map<String, List<String>>
    public static Map<String, List<String>> sorted(Map<String, List<String>> phoneDirectory) {
        // Объявляем переменную типа result, создаем объект типа LinkedHashMa
        Map<String, List<String>> result = new LinkedHashMap<>();
       

        
        phoneDirectory.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())
                .forEach(e -> result.put(e.getKey(), e.getValue()));
        return result;
    }
}
