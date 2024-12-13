import java.util.*;

public class Tokenizer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Trim the input to handle leading/trailing spaces
        s = s.trim();

        // Split the string into tokens using a regex for non-alphabetic characters
        String[] tokens = s.split("[^A-Za-z]+");

        // Count valid tokens and print them
        int tokenCount = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                tokenCount++;
            }
        }

        // Print the number of tokens
        System.out.println(tokenCount);

        // Print each token
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }

        scan.close();
    }
}


