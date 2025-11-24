public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        
        // String concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);
        
        // String methods
        System.out.println("Length: " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Character at index 1: " + str1.charAt(1));
        System.out.println("Substring: " + str1.substring(1, 4));
        
        // String comparison
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));
        System.out.println("str1 contains 'ell': " + str1.contains("ell"));
        
        // String formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("Formatted: " + formatted);
    }
}