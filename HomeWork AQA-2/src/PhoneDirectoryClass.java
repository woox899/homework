import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectoryClass {
    public ArrayList<String> lastNames = new ArrayList<>();

    public Map<String, List<String>> phoneDirectory = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
       phoneDirectory.computeIfAbsent(lastName, l -> new ArrayList<>()).add(phoneNumber);
    }

    public void get(String name) {
        System.out.println(phoneDirectory.get(name));
    }
}
