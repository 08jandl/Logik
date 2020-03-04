package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean dieSonneScheint;
        boolean esRegnet;

        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;
        ergebnis = dieSonneScheint && esRegnet;

        // sout -> tab = System.out.println
        System.out.println("Die Sonne scheint UND es regnet: " + ergebnis);

        boolean esVerwirrtMich;
        boolean ichKenneMichAus;

        esVerwirrtMich = false;
        ichKenneMichAus = true;

        boolean result = esVerwirrtMich || ichKenneMichAus;
        System.out.println("Es verwirrt mich ODER ich kenne mich aus: " + result);
    }
}
