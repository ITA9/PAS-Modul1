package API;

import java.util.Scanner;

public class sc {
  public static String next() {
      Scanner sc = new Scanner(System.in);
      String scS = sc.next();
      return scS;

    }
    public static int nextInt() {
        Scanner sc = new Scanner(System.in);
        int scI = sc.nextInt();
        return scI;

    }
    public static double nextDouble() {
        Scanner sc = new Scanner(System.in);
        double scD = sc.nextDouble();
        return scD;

    }
    public static long nextLong() {
        Scanner sc = new Scanner(System.in);
        long scL = sc.nextLong();
        return scL;

    }
    public static String nextLoong() {
        Scanner sc = new Scanner(System.in);
        String looong = "YOOOUR LOOONG ISSSS VERYY SHOOOORTTT!!!!!!!!";
        long scL = sc.nextLong();
        return scL+looong;

    }

    public static String Datum() {
        String Datum = java.time.LocalDate.now().toString();
        return Datum;


    }

}
