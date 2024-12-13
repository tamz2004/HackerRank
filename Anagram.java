import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length())
        return false;
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(char c:a.toCharArray()){
            int counta=0;
            int countb=0;
            for(int j=0;j<a.length();j++){
            if(c==a.charAt(j))
             counta++;
             if(c==b.charAt(j))
             countb++;
             }
        if(counta!=countb)
        return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}