import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
     public static void main(String[] args) {
// Создаем экз-р HashMap для хранения имен и списков телефонов
Map<String, List<String>> phoneBook = Map.of("Сергей", List.of("+7 999-321-00-07"),"Иван", List.of("+7 900-123-45-45", "555"));

    System.out.println(sort(phoneBook));
}

    public static Map<String, List<String>> sort(Map<String, List<String>> phoneBook) {
    Map<String, List<String>> result = new LinkedHashMap<>();
    phoneBook.entrySet().stream()
            .sorted((e1, e2) -> e2.getValue().size() - e1.getValue().size())
            .forEach(e -> result.put(e.getKey(), e.getValue()));
    return result;
    }
}
