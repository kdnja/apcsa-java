public class EnhancedForLoopComparison {
    public static void main(String[] args) {
        algorithm1();
        algorithm2();
        algorithm3();
        algorithm4();
        algorithm5();
        algorithm6();
    }

    private static void algorithm1() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        for (int p = 1; p < goals.length; p++) {
            if (goals[p - 1] == 0) {
                System.out.println("Previous game had no goals!");
            }
        }
    }

    private static void algorithm2() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        for (int g : goals) {
            if (g == 0) {
                System.out.println("Previous game had no goals!");
            }
        }
    }

    private static void algorithm3() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        int sum = 0;
        for (int n = 0; n < goals.length; n++) {
            sum += goals[n];
        }
        System.out.println("All goals: " + sum);
    }

    private static void algorithm4() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        int sum = 0;
        for (int g : goals) {
            sum += g;
        }
        System.out.println("All goals: " + sum);
    }

    private static void algorithm5() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        for (int skip = 0; skip < goals.length; skip += 2) {
            System.out.print(goals[skip] + " ");
        }
        System.out.println();
    }

    private static void algorithm6() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        for (int g : goals) {
            if (g % 2 == 0) {
                System.out.print(g + " ");
            }
        }
    }
}

