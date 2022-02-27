/**
 * Activity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms {
    /**
     * Perform a selection sort an ArrayList of integers
     * 
     * @param intList an ArrayList of integers
     * @return intList sorted from smallest to largest
     */
    public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList) {
        // Use a for loop to iterate through all the values in the list. This loop
        // will keep track of which value will be swapped with the lowest value.
        for (int i = 0; i < intList.size() - 1; i++) {
            // Create a variable to hold the index of the smallest number.
            int minIndex = i;

            // Use a sequential search to find the smallest number
            for (int searchIndex = i + 1; searchIndex < intList.size(); searchIndex++) {
                // If the value at minIndex is larger, then set minIndex to the index of the
                // smaller value.
                if (intList.get(searchIndex) < intList.get(minIndex))
                    minIndex = searchIndex;
            }

            // Create a variable to temporarily hold the current value at index i
            // and one to hold the smallest value at index minIndex
            int temp = intList.get(i);
            int smallest = intList.get(minIndex);

            // Swap the values
            intList.set(i, smallest);
            intList.set(minIndex, temp);
        }
        return intList;
    }

    /**
     * Perform an insertion sort an ArrayList of integers
     * 
     * @param intList an ArrayList of integers
     * @return intList sorted from smallest to largest
     */
    public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList) {
        // Begin by creating a for loop to iterate through the list, beginning
        // at the second element.
        for (int i = 1; i < intList.size(); i++) {

            // Create an integer value for valueToSort that is the first unsorted element.
            // Remember, for the insertion sort, the first element of the array is considered sorted
            int valueToSort = intList.get(i);

            // Create an int variable to hold the last element of the sorted portion of the array.
            // It's right before the first element of the unsorted portion of the array
            int prevIndex = i - 1;

            // Use a loop to move backwards through the sorted elements of the array using prevIndex
            // in the condition of the loop
            while (prevIndex >= 0) {
                // Create an int variable to hold the sorted value.
                int sortedValue = intList.get(prevIndex);

                // Check if the sorted value is greater than the value to sort
                if (sortedValue > valueToSort) {
                    // If so, switch the values at indexes prevIndex and prevIndex + 1
                    intList.set(prevIndex + 1, sortedValue);
                    intList.set(prevIndex, valueToSort);
                }
                prevIndex--;
            }
        }
        // Return the list
        return intList;
    }

    /**
     * Perform a selection sort an ArrayList of doubles
     * 
     * @param doubleList an ArrayList of doubles
     * @return doubleList sorted from smallest to largest
     */
    public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList) {
        // Begin by creating a for loop to iterate through the list, beginning
        // at the second element.
        for (int i = 1; i < doubleList.size(); i++) {

            // Create a double value for valueToSort that is the first unsorted element.
            // Remember, for the insertion sort, the first element of the array is considered sorted
            double valueToSort = doubleList.get(i);

            // Create an int variable to hold the last element of the sorted portion of the array.
            // It's right before the first element of the unsorted portion of the array
            int prevIndex = i - 1;

            // Use a loop to move backwards through the sorted elements of the array using prevIndex
            // in the condition of the loop
            while (prevIndex >= 0) {
                // Create a double variable to hold the sorted value.
                double sortedValue = doubleList.get(prevIndex);

                // Check if the sorted value is greater than the value to sort
                if (sortedValue > valueToSort) {
                    // If so, switch the values at indexes prevIndex and prevIndex + 1
                    doubleList.set(prevIndex + 1, sortedValue);
                    doubleList.set(prevIndex, valueToSort);
                }
                prevIndex--;
            }
        }
        // Return the list
        return doubleList;
    }

    /**
     * Perform an insertion sort an ArrayList of doubles
     * 
     * @param doubleList an ArrayList of doubles
     * @return doubleList sorted from smallest to largest
     */
    public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList) {
        // Use a for loop to iterate through all the values in the list. This loop
        // will keep track of which value will be swapped with the lowest value.
        for (int i = 0; i < doubleList.size() - 1; i++) {
            // Create a variable to hold the index of the smallest number.
            int minIndex = i;

            // Use a sequential search to find the smallest number
            for (int searchIndex = i + 1; searchIndex < doubleList.size(); searchIndex++) {
                // If the value at minIndex is larger, then set minIndex to the index of the
                // smaller value.
                if (doubleList.get(searchIndex) < doubleList.get(minIndex))
                    minIndex = searchIndex;
            }

            // Create a variable to temporarily hold the current value at index i
            // and one to hold the smallest value at index minIndex
            double temp = doubleList.get(i);
            double smallest = doubleList.get(minIndex);

            // Swap the values
            doubleList.set(i, smallest);
            doubleList.set(minIndex, temp);
        }
        return doubleList;
    }
}
