import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> map = new HashMap<>();

    void addNumber(String phoneNumber, String name) {
        if (map.containsKey(name)) {
            List<String> numbers = map.get(name);
            numbers.add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            map.put(name, numbers);
        }
    }

    String getByName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        if (map.containsKey(name)) {
            List<String> numbers = map.get(name);
            for (String phoneNumber : numbers) {
                stringBuilder.append(name + " - " + phoneNumber + "\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAllBook() {
        StringBuilder stringBuilder = new StringBuilder();
        List<Map.Entry<String, List<String>>> elem = new ArrayList<>(map.entrySet());
        elem.sort((elem1, elem2) -> Integer.compare(elem2.getValue().size(), elem1.getValue().size()));
        for (Map.Entry<String, List<String>> entry : elem) {
            List<String> phoneNumbers = entry.getValue();
            stringBuilder.append(entry.getKey() + " - " + phoneNumbers + "\n");
        }
        return stringBuilder.toString();
    }

}

