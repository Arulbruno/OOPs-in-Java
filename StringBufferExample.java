public class StringBufferExample {  
    public static void main(String[] args) {  
        // Creating a StringBuffer  
        StringBuffer sb = new StringBuffer("Hello");  
        // Appending to the StringBuffer  
        sb.append(", World!"); 
        System.out.println(sb); 
        // Inserting into the StringBuffer  
        sb.insert(5, " Java"); 
        System.out.println(sb); 
        // Deleting from the StringBuffer  
        sb.delete(5, 10);  
        System.out.println(sb); // Output: Hello, World!  
    }  
}

// String immutability in Java ensures:
// Thread safety
// Memory optimization (via the String Pool)
// Security
// Hash code consistency
// Simplicity in design
// If mutability is required, StringBuilder or StringBuffer can be used, providing a flexible alternative 
// while keeping strings immutable for the majority of cases.
