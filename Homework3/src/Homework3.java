import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework3 {
    public static void main(String[] args) {
        words();
        phonebook();
    }

    private static void words() {
        Map<String, Integer> hm = new HashMap<>();
        String[] randomWords = {
                "Coffee", "Potato", "Alpha",
                "Cheese", "Beta", "Humster",
                "Dog", "Cat", "Java",
                "Yava", "Kent", "Coffee",
                "Dog", "Beta", "Humster",
                "Cat", "Java", "Yava", "Dog"
        };

        for (int i = 0; i < randomWords.length; i++) {
            if (hm.containsKey(randomWords[i]))
                hm.put(randomWords[i], hm.get(randomWords[i]) +1);
            else
                hm.put(randomWords[i], 1);
        }
        System.out.println(hm);
    }

    private static void phonebook() {
        Directory directory = new Directory();

        directory.add("antonyan", "8999123321");
        directory.add("antonyan", "8912155326");
        directory.add("bobov", "8917155552");
        directory.add("bobov", "8913455672");
        directory.add("antonyan", "899999999");
        directory.add("igoryan", "899111111");
        directory.add("bobov", "89923231999");
        directory.add("smetanov", "8888123113");
        directory.add("igoryan", "8324325234");

        System.out.println(directory.get("antonyan"));
        System.out.println(directory.get("igoryan"));
        System.out.println(directory.get("bobov"));
        System.out.println(directory.get("smetanov"));
    }
}

    class Directory {
    private Map<String, List<String>> directoryHm = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (directoryHm.containsKey(surname)) {
            phoneNumberList = directoryHm.get(surname);
            phoneNumberList.add(phoneNumber);
            directoryHm.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            directoryHm.put(surname, phoneNumberList);
        }
    }

    public List<String> get(String surname) {
        return  directoryHm.get(surname);
    }

}
