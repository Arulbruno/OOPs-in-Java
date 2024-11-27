import java.util.*;
public class StringBuilderEx {
   // class SQLQueryExample {
        public static void main(String[] args) {
            StringBuilder query = new StringBuilder("SELECT * FROM users");
            query.append(" WHERE age > 18");
            query.append(" ORDER BY name ASC");
            System.out.println("Generated SQL Query: " + query);
        }
    }
    
