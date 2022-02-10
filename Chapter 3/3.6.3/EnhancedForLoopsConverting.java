public class EnhancedForLoopsConverting {
    public static void main(String[] args) {
        // algorithm1();
        // algorithm2();
        // algorithm3();
        // algorithm4();
        // algorithm5();
        // algorithm6();
        algorithm7();
        algorithm8();
        algorithm9();
    }

    // Enhanced For Loop (Given)
    private static void algorithm1() {
        Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};

        // for each Cat c in cats, print line c
        for (Cat c : cats) {
            System.out.println(c);
        }
    }

    // Indexed For Loop
    private static void algorithm2() {
        Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};

        for (int index = 0; index < cats.length; index++) {
            System.out.println(cats[index]);
        }

    }

    // While Loop
    private static void algorithm3() {
        Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};

        int index = 0;
        while (index < cats.length) {
            System.out.println(cats[index]);
            index++;
        }
    }

    // Enhanced For Loop (Given)
    private static void algorithm4() {
        String[] newEngland =
                {"Maine", "New Hampshire", "Vermont", "Massachusetts", "Rhode Island"};

        System.out.println("Two-word states:");

        for (String state : newEngland) {
            if (state.indexOf(" ") > 0) {
                System.out.println(state);
            }
        }

    }

    // Indexed For Loop
    private static void algorithm5() {
        String[] newEngland =
                {"Maine", "New Hampshire", "Vermont", "Massachusetts", "Rhode Island"};

        System.out.println("Two-word states:");

        for (int index = 0; index < newEngland.length; index++) {
            String state = newEngland[index];
            if (state.indexOf(" ") > 0) {
                System.out.println(state);
            }
        }
    }

    // While Loop
    private static void algorithm6() {
        String[] newEngland =
                {"Maine", "New Hampshire", "Vermont", "Massachusetts", "Rhode Island"};

        System.out.println("Two-word states:");

        int index = 0;
        while (index < newEngland.length) {
            String state = newEngland[index];
            if (state.indexOf(" ") > 0) {
                System.out.println(state);
            }
            index++;
        }
    }

    // Enhanced For Loop (Given)
    private static void algorithm7() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        
        int numHighScores = 0;

        for (int g : goals) {
            if (g > 2) {
                numHighScores++;
            }
        }

        System.out.println(numHighScores);
    }

    // Indexed For Loop
    private static void algorithm8() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        
        int numHighScores = 0;

        for (int index = 0; index < goals.length; index++) {
            if (goals[index] > 2) {
                numHighScores++;
            }
        }

        System.out.println(numHighScores);
    }

    // While Loop
    private static void algorithm9() {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        
        int numHighScores = 0;

        int index = 0;

        while (index < goals.length) {
            if (goals[index] > 2) {
                numHighScores++;
            }
            index++;
        }

        System.out.println(numHighScores);
    }
}
