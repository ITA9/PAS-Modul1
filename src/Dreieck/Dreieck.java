/*
 *
 *
 *
 * Beschreibung
 * Aufgabe vom 30.9 (IF-Anweisung - Übung A)
 * @version 1.0 vom 30.09.2019
 * @author Gabriel Akrutat && Max Goldgamer
 */

import java.util.Scanner;

public class Dreieck {

    // Eingabe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Strecke a:");
        double a = sc.nextDouble();

        System.out.println("Strecke b:");
        double b = sc.nextDouble();

        System.out.println("Strecke c");
        double c = sc.nextDouble();

        sc.close();

        // Verarbeitung & Ausgabe
        if (a == b && b == c) {
            System.out.println("Das Dreieck entspricht einem gleichseitigen Dreieck");
        }
        else if (a == b || b == c) {
            System.out.println("Das Dreieck entspricht einem gleichschenkligen Dreieck");
        }
        else {
            System.out.println("Alle Seiten des Dreiecks sind unterschiedlich lang");
        }

    } // end of main

} // end of class IF


