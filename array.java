public class array {
    public static void main(String[] args) {
        
        // ===== ARRAY DECLARATION AND INITIALIZATION =====
        // Arrays are fixed-size collections of elements of the same type
        
        // 1. Declare and initialize with values
        int[] numbers = {10, 20, 30, 40, 50};
        
        // 2. Declare array with specific size (default values are 0 for int)
        int[] scores = new int[5];
        
        // 3. String array
        String[] names = {"Alice", "Bob", "Charlie"};
        
        // ===== ACCESSING ARRAY ELEMENTS =====
        // Arrays are 0-indexed (first element is at index 0)
        System.out.println("First number: " + numbers[0]); // Output: 10
        System.out.println("Last number: " + numbers[4]);  // Output: 50
        
        // ===== MODIFYING ARRAY ELEMENTS =====
        numbers[0] = 15; // Change first element
        scores[2] = 85;  // Assign value to index 2
        
        // ===== ARRAY LENGTH =====
        // Get the number of elements in array using .length property
        System.out.println("Array length: " + numbers.length); // Output: 5
        
        // ===== ITERATING THROUGH ARRAYS =====
        
        // 1. Traditional for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // 2. Enhanced for loop (foreach)
        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // ===== MULTI-DIMENSIONAL ARRAYS =====
        // 2D Array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Access 2D array element: matrix[row][column]
        System.out.println("Element at [1][2]: " + matrix[1][2]); // Output: 6
        
        // ===== ARRAY OPERATIONS =====
        
        // Find maximum value
        int max = findMax(numbers);
        System.out.println("Maximum: " + max);
        
        // Find sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        
        // ===== COPYING ARRAYS =====
        int[] copy = numbers.clone(); // Create a copy
        
        // ===== ARRAY LIMITATIONS =====
        // - Fixed size (cannot grow or shrink)
        // - Must contain same data type
        // - To overcome size limitation, use ArrayList or other collections
    }
    
    // Helper method to find maximum value
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}