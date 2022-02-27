/*
 * A24: 3.7.2 ArrayList Steps 10-11
 * 
 * Author: Caden Jamason Date: 02/14/2022 Course: AP CSA 1
 * 
 * Description: An interactive program to practice using all of the methods in ArrayList.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Caden Jamason
 */
public class ArrayListFurniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        ArrayList<String> furnitureList = new ArrayList<String>(3);
        furnitureList.add(0, "Chair");
        furnitureList.add(1, "Table");
        furnitureList.add(2, "Sofa");

        while (!(input.trim().toLowerCase().equals("q"))) {
            System.out.println(furnitureList);
            System.out
                    .println("Would you like to (a)dd, (i)nsert, (r)emove, re(p)lace, or (q)uit?");
            input = sc.nextLine();
            if (input.trim().toLowerCase().equals("a")) {
                System.out.println("Enter a piece of furniture:");
                input = sc.nextLine();
                furnitureList.add(input);
                input = "";
            }
            if (input.trim().toLowerCase().equals("i")) {
                System.out.println("Enter a piece of furniture:");
                input = sc.nextLine();
                System.out.println("Enter a position:");
                int position = sc.nextInt();
                if (position >= 1 && position <= furnitureList.size()) {
                    furnitureList.add(position - 1, input);
                    input = "";
                } else {
                    System.out.println("Bad position!");
                    input = "";
                }
            }
            if (input.trim().toLowerCase().equals("r")) {
                System.out.println("Enter a position:");
                int position = sc.nextInt();
                if (position >= 1 && position <= furnitureList.size()) {
                    furnitureList.remove(position - 1);
                } else {
                    System.out.println("Bad position!");
                }
            }
            if (input.trim().toLowerCase().equals("p")) {
                System.out.println("Enter a piece of furniture:");
                input = sc.nextLine();
                System.out.println("Enter a position:");
                int position = sc.nextInt();
                if (position >= 1 && position <= furnitureList.size()) {
                    furnitureList.set(position - 1, input);
                    input = "";
                } else {
                    System.out.println("Bad position!");
                    input = "";
                }
            }
            if (input.trim().toLowerCase().equals("q")) {
                System.out.println("Quitting...");
            }
        }
    }
}
