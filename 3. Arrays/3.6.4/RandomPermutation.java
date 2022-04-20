import java.util.Random;

public class RandomPermutation {
    /**
     * Generates a randomly permuted array.
     * 
     * @param length - The length of the array to be generated, which <em>must be more than zero.</em>
     * @return A randomly permuted array based on the <strong>length</strong> parameter.
     */
    static int[] next(int length) {
        // Instantiate a new random number generator
        Random random = new Random();
        // Holds generated numbers from 1 to `length`
        int[] p = new int[length];
        // Holds randomized values from array `p`
        int[] r = new int[length];
        // Holds the current length of the array
        int n = length;

        // Generates values from 1 to `length`
        for (int i = 1; i <= p.length; i++) {
            p[i - 1] = i;
        }

        // While the current length is more than zero
        while (n > 0) {
            // Generate random number
            int randomInt = random.nextInt(n);
            // Select an element in array p from a random location
            int randomP = p[randomInt];
            // Copy its value to the last unused element of array r
            r[n - 1] = randomP;
            // Copy the last value in p to the location in p you just used
            p[randomInt] = p[n - 1];
            // Decrement a counter so that the last element of p will not be used more than once
            n -= 1;
        }
        // Returns the randomly permuted array
        return r;
    }
}
