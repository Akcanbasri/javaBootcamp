
import java.util.List;
import java.util.Scanner;

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
    public static boolean isPrime(int num) {
        if (num < 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        for (int i = 3; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPerfect(int num) {
        if (num == 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            return true;
        }

        return false;
    }

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

        //Arrays
        String[] students = new String[3];
        students[0] = "hasan";
        students[1] = "basri";
        students[2] = "akcan";

        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("************Arrays ended***************");

        double[] myList = {1.1, 24.4, 41.5};
        double total = 0;
        double max = myList[0];

        for (double d : myList) {
            if (max < d) {
                max = d;
            }
            total += d;
        }

        System.out.println("Max: " + max);
        System.out.println("Total: " + total);

        System.out.println("************Arrays V2 ended***************");

        String[][] cities = new String[3][3];

        cities[0][0] = "Istanbul";
        cities[0][1] = "Bursa";
        cities[0][2] = "Edirne";
        cities[1][0] = "Konya";
        cities[1][1] = "Ankara";
        cities[1][2] = "Sivas";
        cities[2][0] = "Urfa";
        cities[2][1] = "Adana";
        cities[2][2] = "Siirt";

        for (String[] city : cities) {
            System.out.println("-------------------------");
            for (String string : city) {
                System.out.println(string);
            }
        }

        // Strings
        System.out.println("**************************Strings****************************");

        String message = "Bugun Hava cok Guzel";
        System.out.println(message);
        System.out.println("Eleman Sayisi: " + message.length());
        System.out.println("besinci Eleman: " + message.charAt(4));
        System.out.println(message.concat(". Disari cikabilirm."));
        System.out.println(message.startsWith("B"));
        System.out.println(message.startsWith("x"));
        System.out.println(message.endsWith("l"));
        System.out.println(message.endsWith("g"));

        char[] chars = new char[5];
        message.getChars(0, 5, chars, 0);
        System.out.println(chars);

        System.out.println(message.indexOf('a')); // ilk bulduğunu bize verir.
        System.out.println(message.indexOf("av")); // ilk bulduğunu bize verir.
        System.out.println(message.lastIndexOf("a"));

        String newMessage = message;
        System.out.println(newMessage.replace(" ", "-"));

        System.out.println(message.substring(2, 5)); // stringden metin alma.

        // Split
        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message2 = "      Bugun Hava cok Guzel ";
        System.out.println(message.trim());

        System.out.println("**********************************************Prime Number?*********************************************");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi girin");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("number: " + number + " is PRIME number");
        } else {
            System.out.println("number: " + number + " is NOT PRIME number");
        }

        System.out.println("**********************************************Kalin sesli ve Ince sesli kelimeler*********************************************");
        char harf = 'a';

        switch (harf) {
            case 'a', 'ı', 'o', 'u' ->
                System.out.println("Kalin");
            case 'e', 'i', 'ö', 'ü' ->
                System.out.println("Ince");
            default ->
                System.out.println("Sessiz Harf");
        }

        System.out.println("**********************************************Mukemmel sayi*********************************************");
        int num = 6;

        if (isPerfect(num)) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }

        System.out.println("**********************************************sayi bulma*********************************************");
        int[] numbers = new int[]{1, 2, 4, 7, 9};
        int find = 4;
        boolean isFınd = false;

        for (int i : numbers) {
            if (i == find) {
                isFınd = true;
                break;
            }
        }

        if (isFınd) {
            System.out.println("FOUND!");
        } else {
            System.out.println("NOT FOUND!");
        }
    }

}
