/**
 * Activity 3.7.6
 */
import java.util.ArrayList;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(16);
        intList.add(22);
        intList.add(19);
        intList.add(5);
        intList.add(20);
        intList.add(7);
        intList.add(4);
        intList.add(-9);
        intList.add(100);
        intList.add(57);

        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(-4.5);
        doubleList.add(-9.0);
        doubleList.add(0.0);
        doubleList.add(6.45);
        doubleList.add(7.4);
        doubleList.add(6.4);
        doubleList.add(10.1);
        doubleList.add(9.9);

        ArrayList<Integer> testSelectionInt;
        ArrayList<Double> testSelectionDouble;
        ArrayList<Integer> testInsertionInt;
        ArrayList<Double> testInsertionDouble;

        // Test the integer selection sort
        testSelectionInt = SortingAlgorithms.selectionSortInt(intList);
        System.out.println(testSelectionInt);

        // Test the double selection sort
        testSelectionDouble = SortingAlgorithms.selectionSortDouble(doubleList);
        System.out.println(testSelectionDouble);

        // Test the integer insertion sort
        testInsertionInt = SortingAlgorithms.insertionSortInt(intList);
        System.out.println(testInsertionInt);

        // Test the double insertion sort
        testInsertionDouble = SortingAlgorithms.insertionSortDouble(doubleList);
        System.out.println(testInsertionDouble);
    }
}
