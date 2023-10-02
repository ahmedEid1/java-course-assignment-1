package Problems;

import java.util.ArrayList;

public class Problem2 {
    public Problem2() {
        int n = 50;
        var primes = getPrimesUpTo(n);

        printProblem2Results(primes, n);
    }

    private static void printProblem2Results(ArrayList<Integer> primes, int n) {
        System.out.println("Problem 2");
        System.out.printf("there are %d Primes from 1 to %d: \n", primes.size(), n);
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println("\n--------------------------");
    }

    private ArrayList<Integer> getPrimesUpTo(int n) {
        // create a set
        var primes = new ArrayList<Integer>();

        outerLoop:
        for (int i = 2; i <= n; i++) {

            var squareRootOfI = Math.sqrt(i);

            innerLoop:
            for (int j = 2; j <= squareRootOfI; j++) {
                if (i % j == 0) {
                    continue outerLoop;
                }
            }

            primes.add(i);
        }

        return primes;
    }
}
