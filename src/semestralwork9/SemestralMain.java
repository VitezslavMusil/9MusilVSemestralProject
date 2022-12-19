package semestralwork9;

import java.util.Scanner;

/**
 * 1. Program creates the illusion of an animation of a snowy forest
 * 2. Program sorts given point by their increasing distance to a set line
 * @author vitmus
 * @version 0.5 19/12/22
 */

public class SemestralMain {

    public static void main(String[] args) {
        boolean programExit = false;
        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case (0) -> programExit = true;
                case (1) -> XmasASCII.snowyForest();
                case (2) -> lineDistance.lineDistance();
            }
            if (programExit) {
                System.out.println("Inu dobrá poutníče, shledáme se zase příště");
                break;
            }
        }
    }
    
    /**
    * displayMenu - This method presents the user with all the options they can use with a nice interface
    */
    public static void displayMenu() {
        System.out.println("x------------------------------------------------------------------x");
        System.out.println("| Vítej poutníče! Jaký je dnes cíl tvé cesty?                      |");
        System.out.println("x------------------------------------------------------------------x");
        System.out.println("| 1 - Přišel jsem sledovat jak sněží na les                        |");
        System.out.println("| 2 - Potřebuji srovnat od nejbližšího k nejvzdálenějšímu u přímky |");
        System.out.println("| 0 - Dnes jsem se šel pouze projít (ukončí program)               |");
        System.out.println("x------------------------------------------------------------------x");
    }
}