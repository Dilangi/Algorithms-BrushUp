package Practice;

import java.util.*;

public class DistinctHashes {

    // Method to compute and generate secretKey[] for maximum distinct hash[] values
    public static int[] generateSecretKeys(int[] param) {
        int n = param.length;
        int[] secretKey = new int[n];
        Set<Integer> usedHashValues = new HashSet<>();

        Map<Integer, Integer> paramUsage = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int p = param[i];
            int start = paramUsage.getOrDefault(p, 0);

            // Find the next unused hash value for this param[i]
            boolean found = false;
            for (int candidate = start; candidate < p; candidate++) {
                int hashValue = candidate % p;
                if (!usedHashValues.contains(hashValue)) {
                    secretKey[i] = candidate;
                    usedHashValues.add(hashValue);
                    paramUsage.put(p, candidate + 1);  // Update next starting point for this p
                    found = true;
                    break;
                }
            }

            // If couldn't find unused hash, just pick any number (0), we already have that hash
            if (!found) {
                secretKey[i] = 0;
            }
        }

        return secretKey;
    }

    // Method to compute the hash array from secretKey[] and param[]
    public static int[] computeHashArray(int[] secretKey, int[] param) {
        int n = param.length;
        int[] hash = new int[n];
        for (int i = 0; i < n; i++) {
            hash[i] = secretKey[i] % param[i];
        }
        return hash;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int[] param = {1, 2, 3, 5, 5};  // Example input

        int[] secretKey = generateSecretKeys(param);
        int[] hash = computeHashArray(secretKey, param);

        System.out.println("param[]     = " + Arrays.toString(param));
        System.out.println("secretKey[] = " + Arrays.toString(secretKey));
        System.out.println("hash[]      = " + Arrays.toString(hash));

        // Print number of distinct hash values achieved
        Set<Integer> distinctHashes = new HashSet<>();
        for (int h : hash) distinctHashes.add(h);
        System.out.println("Number of distinct hash[] values = " + distinctHashes.size());
    }

}
