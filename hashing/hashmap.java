import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add elements to the HashMap using put() method
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        hashMap.put("orange", 15);

        // Get and print the size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());

        // Check if the HashMap is empty using isEmpty() method
        System.out.println("Is the HashMap empty? " + hashMap.isEmpty());

        // Get and print the value associated with a key using get() method
        System.out.println("Value of 'apple': " + hashMap.get("apple"));

        // Get and print the value associated with a key using getOrDefault() method
        System.out.println("Value of 'grapes': " + hashMap.getOrDefault("grapes", 0));

        // Check if the HashMap contains a specific key using containsKey() method
        System.out.println("Does the HashMap contain 'grapes'? " + hashMap.containsKey("grapes"));

        // Check if the HashMap contains a specific value using containsValue() method
        System.out.println("Does the HashMap contain value '5'? " + hashMap.containsValue(5));

        // Remove an element from the HashMap using remove() method
        hashMap.remove("banana");

        // Print the updated HashMap
        System.out.println("Updated HashMap after removing 'banana': " + hashMap);

        // Iterate over the HashMap using keySet() and enhanced for loop
        System.out.println("Iterating over the HashMap:");
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println(key + ": " + value);
        }

        // Replace the value associated with a key using replace() method
        hashMap.replace("apple", 20);

        // Print the HashMap after updating the value
        System.out.println("Updated HashMap after replacing the value of 'apple': " + hashMap);

        // Clear the HashMap using clear() method
        hashMap.clear();

        // Print the HashMap after clearing it
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
