package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapReverser {
    public static Map<String, String> returnMap = new LinkedHashMap<>();

    public String reverse(String input) {
        Map<String, String> json = JsonParser.parse(input);

        for (Map.Entry<String, String> entry: json.entrySet()) {
            StringBuilder reversibleKey = new StringBuilder(entry.getKey());
            StringBuilder reversibleValue = new StringBuilder(entry.getValue());

            String reversedKey = reversibleKey.reverse().toString();
            String reversedValue = reversibleValue.reverse().toString();
            returnMap.put(reversedKey, reversedValue);
        }

        String returnString = "";
        for (Map.Entry<String, String> entry : returnMap.entrySet()) {
            returnString += "\"" + entry.getKey() + "\": ";
            returnString += "\"" + entry.getValue() + "\", ";
        }

        returnString = returnString.substring(0, returnString.length()-2);

        return "{ " + returnString + " }";
    }
}
