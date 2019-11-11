package Geldwechselautomat;
import API.sc;

public class main {

    public static void main (String[] args ) {



        System.out.println("Gib dein geld her du wixxer");
        System.out.println("Wieviel Geld hast du insgesamt?");
        double geldbetrag = sc.nextDouble();
        System.out.println("Wieviele Euromünzen willst du?");
        int eurotaller = sc.nextInt();
        System.out.println("Wieviele Centmünzen willst du?");
        int centtaller = sc.nextInt();
        geldbetrag = geldbetrag+Math.random();


        System.out.println("Du hast: "+geldbetrag+ "€ insgesamt als: "+ eurotaller+ "€ Euromünzen und "+centtaller+ "€ Centmünzen");

















    }
}
