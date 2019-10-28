package ElektroBlitz;

import API.sc;

public class ElektroBlitz {



    public static void main (String[] args){
        while (Start() == -1);
    }


    private static void error() {
        System.out.println("Fehler!:");
        System.out.println("Dieser Rechner dient nur zur Berechnung von Stromstärke, Spannung, Widerstand oder Leitwert");
        System.out.println("Neuer Versuch");
        System.out.println(" ");

    }

    private static void Stromstaerke() {
        System.out.println("Welche werte sind vorhanden? Bitte die zugehörige Nummer der Formel angeben!");
        System.out.println("1: Spannung und Widerstand");
        System.out.println("2: Spannung und Leitwert");
        int wert = sc.nextInt();
        switch (wert) {
            case 1:
                System.out.println("Bitte trage nun den Wert für die Spannung ein.");
                Double uw = sc.nextDouble();
                System.out.println(uw); //Test
                System.out.println("Bitte trage nun den Wert für den Widerstand ein.");
                Double wu = sc.nextDouble();
                System.out.println(wu); //Test
                System.out.println("Nun trage dein Ergebnis ein.");
                Double uwe = sc.nextDouble();
                System.out.println(uwe); //Test
                break;
            case 2:
                System.out.println("Bitte trage nun den Wert für die Spannung ein.");
                Double ug = sc.nextDouble();
                System.out.println(ug); //Test
                System.out.println("Bitte trage nun den Wert für den Gleitwert ein.");
                Double gu = sc.nextDouble();
                System.out.println(gu); //Test
                System.out.println("Nun trage dein Ergebnis ein.");
                Double uge = sc.nextDouble();
                System.out.println(uge); //Test
                break;
            default:
                System.out.println("Fehler!:");
                System.out.println("Bitte nur eine 1 oder eine 2 eingeben!");
        }

    }
    private static void Spannung() {


        System.out.println("Die Spannung");
    }

    private static void Widerstand() {


        System.out.println("Der Widerstand");
    }

    private static void Leitwert() {


        System.out.println("Der Leitwert");
    }


    private static int Start() {


        System.out.println("Welche Einheit soll berechnet werden? Stromstärke, Spannung, Widerstand oder Leitwert ");
        String ergebnis = sc.next();

//        if (!ergebnis.equalsIgnoreCase("Stromstärke") && !ergebnis.equalsIgnoreCase("Spannung") && !ergebnis.equalsIgnoreCase("Widerstand") && !ergebnis.equalsIgnoreCase("Leitwert")) {
//            error();
//            return -1;
//        } else if (ergebnis.equalsIgnoreCase("Stromstärke")) {
//            Stromstärke();
//
//        } else if (ergebnis.equalsIgnoreCase("Spannung")) {
//            Spannung();
//
//        } else if (ergebnis.equalsIgnoreCase("Widerstand")) {
//            Widerstand();
//
//        } else if (ergebnis.equalsIgnoreCase("Leitwert")) {
//            Leitwert();
//
//        }


            switch(ergebnis)
            {
                case "Stromstärke":
                    Stromstaerke();
                    break;
                case "Spannung":
                    Spannung();
                    break;
                case "Widerstand":
                   Widerstand();
                    break;
                case "Leitwert":
                    Leitwert();
                    break;
                default:
                    error();
                    return -1;
            }









        return 0;
    }
}