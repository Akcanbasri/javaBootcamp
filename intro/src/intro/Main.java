/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro;

/**
 *
 * @author Lenova
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Wordl");
        System.out.println("****************************");

        // stringler
        String middileString = "ilginizi cekebilir";
        String lowerString = "Vade suresi";
        System.out.println("****************************");

        System.out.println(middileString + "\n" + lowerString);
        System.out.println("****************************");

        // Numerical values
        int vade = 12;
        double usdYesterday = 1.80;
        double usdToday = 1.80;

        // Boolean Values
        boolean usdIsDown = false;
        String priceActionImg = "";

        if (usdToday < usdYesterday) {
            usdIsDown = true;
            priceActionImg = "down.svg";
        } else if (usdToday > usdYesterday) {
            usdIsDown = false;
            priceActionImg = "up.svg";
        } else {
            priceActionImg = "equal.svg";
        }

        System.out.println(priceActionImg);
        System.out.println("****************************");

        // Arrays
        String[] credits = {"Fast Credit", "gets salary from our bank", "Happy entire"};
        for (int i = 0; i < credits.length; i++) {
            String credit = credits[i];
            System.out.println(credit);

        }
        System.out.println("****************************");
    }

}
