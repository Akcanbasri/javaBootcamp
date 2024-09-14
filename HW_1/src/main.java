/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenova
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 10;
        int b = 11;
        int c = 12;
        int biggestNumber = 1;

        if (biggestNumber < b) {
            biggestNumber = b;
        }

        if (biggestNumber < c) {
            biggestNumber = c;
        }
        System.out.println(biggestNumber);
        System.out.println("************biggest number ended***************");

        char grade = 'A';

        switch (grade) {
            case 'A' ->
                System.out.println("You are perfect");
            case 'B' ->
                System.out.println("You are good");
            case 'C' ->
                System.out.println("Not bad");
            case 'D' ->
                System.out.println("Bad grade");

            default ->
                System.out.println("Wrong grade character");
        }
        System.out.println("************switch case ended***************");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        System.out.println("************for ended***************");

        int x = 0;
        while (x < 10) {
            System.out.println(x);
            x += 1;
        }
        System.out.println("************while ended***************");

        int y = 0;
        do {
            System.out.println(y);
            y += 1;
        } while (y < 10);
        System.out.println("************do while ended***************");

    }
}
