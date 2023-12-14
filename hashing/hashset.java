import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet using add() method
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");

        // Get and print the size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());

        // Check if the HashSet is empty using isEmpty() method
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());

        // Check if an element is present in the HashSet using contains() method
        System.out.println("Does the HashSet contain 'apple'? " + hashSet.contains("apple"));

        // Remove an element from the HashSet using remove() method
        hashSet.remove("banana");

        // Print the updated HashSet
        System.out.println("Updated HashSet after removing 'banana': " + hashSet);

        // Iterate over the HashSet using enhanced for loop
        System.out.println("Iterating over the HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // Clear the HashSet using clear() method
        hashSet.clear();

        // Print the HashSet after clearing it
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
