package com.example.storeratings;
import java.util.HashMap;
import java.util.Map;

public class storeRatings
{
    public static void main(String[] args) {
        // Step 1: Create a Map to store key-value pairs
        Map<String, Integer> dataMap = new HashMap<>();

        // Step 2: Add key-value pairs to the Map
        dataMap.put("hi", 9);
        dataMap.put("mom", 8);
        dataMap.put("d", 6);
        dataMap.put("foo", 3);
        dataMap.put("ach", 4);
        dataMap.put("cbba", 5);
        dataMap.put("edf", 7);

        // Step 3: Print the entire Map
        System.out.println("Original Map: " + dataMap); // This prints the default map format

        // Step 4: Print each entry in the Map
        System.out.println("Entries in the Map:");
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            System.out.println("[" + entry.getKey() + ":" + entry.getValue() + "]");
        }

        // Step 5: Print all entries in one line
        System.out.print("All Entries: [");
        boolean first = true; // To handle the formatting for the first entry
        for (Map.Entry<String, Integer> entry : dataMap.entrySet()) {
            if (!first) {
                System.out.print(" "); // Print space before each entry except the first
            }
            System.out.print(entry.getKey() + ":" + entry.getValue());
            first = false; // After the first entry, set to false
        }
        System.out.println("]"); // Close the bracket for all entries
    }
}

