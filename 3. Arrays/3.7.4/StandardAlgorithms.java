import java.util.ArrayList;

public class StandardAlgorithms {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        // Algorithm 1 - number of zeros
        int a = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) == 0) {
                a++;
            }
        }
        System.out.println("Number of zeros: " + a);

        // Algorithm 2 - smallest number
        int b = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) < b) {
                b = arrList.get(i);
            }
        }
        System.out.println("Smallest number: " + b);

        // Algorithm 3 - average number
        double c = 0;
        for (int i = 0; i < arrList.size(); i++) {
            c += arrList.get(i);
        }
        System.out.println("Average number: " + (c / arrList.size()));
    }
}
