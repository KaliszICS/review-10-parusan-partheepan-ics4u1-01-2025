public class PracticeProblem {

    public static void main(String[] args) {
        // Test pyramid
        System.out.println("Pyramid(4):");
        System.out.print(pyramid(4)); // Using print instead of println to avoid double newline
        
        System.out.println("\nSquare(3):");
        System.out.print(square(3)); // Using print instead of println
        
        // Test hasLowercase
        System.out.println("\nhasLowercase tests:");
        System.out.println(hasLowercase("HELLO"));      // false
        System.out.println(hasLowercase("Hello"));      // true
        System.out.println(hasLowercase("123!@#"));     // false
        System.out.println(hasLowercase("aBC"));        // true
    }
    
    public static String pyramid(int rows) {
        if (rows <= 0) return ""; // Handle edge case
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= rows; i++) {
            // Add leading spaces
            for (int j = 1; j <= rows - i; j++) {
                result.append(" ");
            }
            
            // Add asterisks with spaces
            for (int k = 1; k <= i; k++) {
                result.append("*");
                if (k < i) {
                    result.append(" ");
                }
            }
            
            // New line after each row (but not after last row)
            if (i < rows) {
                result.append("\n");
            }
        }
        
        return result.toString();
    }
    
    public static String square(int size) {
        if (size <= 0) return ""; // Handle edge case
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // First row, last row, first column, or last column gets asterisk
                if (i == 1 || i == size || j == 1 || j == size) {
                    result.append("*");
                } else {
                    result.append(" ");
                }
            }
            // New line after each row (but not after last row)
            if (i < size) {
                result.append("\n");
            }
        }
        
        return result.toString();
    }
    
    public static boolean hasLowercase(String str) {
        if (str == null) return false; // Handle null input
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Check if character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                return true;
            }
        }
        return false;
    }
}