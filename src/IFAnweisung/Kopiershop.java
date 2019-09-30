package IFAnweisung;/*
 *
 *
 *
 * Beschreibung
 * Aufgabe vom 30.9 (IF-Anweisung - Übung B)
 * @version 1.0 vom 30.09.2019
 * @author Gabriel Akrutat && Max Goldgamer
 */
import java.util.Scanner;

public class Kopiershop {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Eingabe



        System.out.println("Wieviele Kopien möchten sie anfertigen?");
        int anzahlKopien = sc.nextInt();
        System.out.println("Wieviel kostet eine Kopie?");
        double preis = sc.nextDouble();
        System.out.println("Sind sie ein Stammkunde? Ja/Nein");
        String stammkunde = sc.next();






        sc.close();
        // Verarbeitung
        double anzahlpreis = preis * anzahlKopien;

        if (!stammkunde.equalsIgnoreCase("Ja") || !stammkunde.equalsIgnoreCase("Nein") ) {
            System.out.println("Bitte geben sie nur Ja oder Nein ein, da die folgende Berechnung sonst verfälscht ist");
        }
    else if (anzahlKopien >= 100 && anzahlKopien <= 500) {
        if (stammkunde.equalsIgnoreCase("Ja")) {
            System.out.println("Sie müssen " + (anzahlpreis / 100) * 80  + "€ zahlen.");
            }
            else {
                System.out.println("Sie müssen " + (anzahlpreis / 100) * 90 + "€ zahlen.");
            }
        }
        else if (anzahlKopien <= 99)
        {
            if (stammkunde.equalsIgnoreCase("Ja"))
            {
                System.out.println("Sie müssen " + (anzahlpreis / 100) * 90 + "€ zahlen.");
            }
            else{
            System.out.println("Sie müssen " + anzahlpreis + "€ zahlen.");
        }
        }
        else if (anzahlKopien >= 500){
            if (stammkunde.equalsIgnoreCase("Ja")) {
                System.out.println("Sie müssen "+ (anzahlpreis / 100) * 70  + "€ zahlen.");
            }
            else  {
                System.out.println("Sie müssen " + (anzahlpreis / 100) * 80 + "€ zahlen.");
            }
        }
        // Ausgabe
    } // end of main


} // end of class IF
