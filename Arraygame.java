import java.util.*;

public class Arraygame {

    public static boolean canWin(int leap, int[] game) {
    return isSolvable(leap, game, 0);
}

private static boolean isSolvable(int leap, int[] game, int i) {
    // Base cases
    if (i >= game.length) {
        return true; // Win by moving off the array
    }
    if (i < 0 || game[i] == 1) {
        return false; // Invalid move
    }

    // Mark the current cell as visited
    game[i] = 1;

    // Recursive moves: move forward, jump forward, or move backward
    return isSolvable(leap, game, i + leap) ||  // Jump forward
           isSolvable(leap, game, i + 1) ||    // Move forward
           isSolvable(leap, game, i - 1);      // Move backward
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}