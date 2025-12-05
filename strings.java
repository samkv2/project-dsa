public class strings {
    public static void main(String[] args) {
        // String creation and initialization
        String str1 = "Hello, World!"; // String literal
        String str2 = new String("Hello, World!"); // Using constructor
        
        // String length
        int length = str1.length(); // Returns 13
        System.out.println("Length: " + length);
        
        // String concatenation
        String str3 = "Hello" + " " + "Java"; // Using + operator
        String str4 = str1.concat(" Welcome!"); // Using concat method
        System.out.println("Concatenation: " + str4);
        
        // Character access
        char firstChar = str1.charAt(0); // Returns 'H'
        System.out.println("First character: " + firstChar);
        
        // Substring
        String sub = str1.substring(0, 5); // Returns "Hello"
        System.out.println("Substring: " + sub);
        
        // String comparison
        boolean equals = str1.equals(str2); // Case-sensitive comparison
        boolean equalsIgnoreCase = str1.equalsIgnoreCase("hello, world!"); // Case-insensitive
        System.out.println("Equals: " + equals + ", IgnoreCase: " + equalsIgnoreCase);
        
        // Finding index
        int index = str1.indexOf("World"); // Returns 7
        System.out.println("Index of 'World': " + index);
        
        // Case conversion
        String upper = str1.toUpperCase();
        String lower = str1.toLowerCase();
        System.out.println("Uppercase: " + upper + ", Lowercase: " + lower);
        
        // Trimming whitespace
        String withSpaces = "  Hello  ";
        String trimmed = withSpaces.trim(); // Removes leading/trailing spaces
        System.out.println("Trimmed: '" + trimmed + "'");
        
        // String replacement
        String replaced = str1.replace("World", "Java");
        System.out.println("Replaced: " + replaced);
        
        // Splitting strings
        String[] words = "Java is awesome".split(" "); // Returns array ["Java", "is", "awesome"]
        System.out.println("Words: " + java.util.Arrays.toString(words));
        
        // Checking string content
        boolean startsWith = str1.startsWith("Hello");
        boolean endsWith = str1.endsWith("!");
        boolean contains = str1.contains("World");
        System.out.println("Starts with 'Hello': " + startsWith + ", Contains 'World': " + contains + ", Ends with '!': " + endsWith);
    }
}
