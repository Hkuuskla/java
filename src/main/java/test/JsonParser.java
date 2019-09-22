package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class JsonParser {

    public static Map<String, String> parse(String input) {
        Map<String, String> jsonMap = new LinkedHashMap<>();

        input = input.replace("}", "");
        input = input.replace("{", "");
        String[] keysAndValues = input.split(",");

        for (String element: keysAndValues) {
            String keyAndValue = element.replace("\"", "").trim();
            String[] keyAndValueArray = keyAndValue.split(":");
            jsonMap.put(keyAndValueArray[0].trim(), keyAndValueArray[1].trim());
        }
        return jsonMap;
    }
}
