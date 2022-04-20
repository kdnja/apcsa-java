/*
 * Activity 3.6.2
 */
public class TraversalAlgorithmsWhile {
    public static void main(String[] args) {
        algorithm1();
        algorithm2();
        algorithm3();
        algorithm4();
    }

    public static void algorithm1() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        int index = 0;
        while (index < goals.length) {
            if (goals[index] == 0) {
                System.out.println("Previous game had no goals!");
            }
            index++;
        }
    }

    public static void algorithm2() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

        int sum = 0;
        int i = 0;
        while (i < goals.length) {
            sum += goals[i];
            i++;
        }
        System.out.println("All goals: " + sum);
    }

    public static void algorithm3() {
        String[] misc = {"A", "B", "C", "D", "E", "F"};

        int num = 0;
        while (num < misc.length - 3) {
            num++;
            System.out.println(misc[num] + " ");
        }
    }

    public static void algorithm4() {
        String[] misc = {"A", "B", "C", "D", "E", "F"};

        int j = 0;
        while (j < misc.length) {
            System.out.println(misc[j] + " ");
            j += 2;
        }
    }

}
