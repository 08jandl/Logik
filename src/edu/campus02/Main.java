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

        //Beispiel 3 PP (1 > 3 UND NICHT 3-1 < 5) ODER 2==4*4
        //              (1 > 3 && ! 3 - 1 < 5) || 2 == 4*4

        boolean teil1;
        boolean teil2;
        boolean ergebnis3;

        teil2 = 2 == 4*4;
        teil1 = 1 > 3 && ! (3 - 1 < 5);

        ergebnis3 = teil1 || teil2;

        System.out.println("Ergebnis 3: " + ergebnis3);

        // Bsp 4 PP (6 >= 2 * 3 || 2 - 3 < 0) && (1 * 1 == 1 && 1 != 1+1)

        boolean part1 = 6 >= 2 * 3 || 2 - 3 < 0;
        boolean part2 = 1 * 1 == 1 && 1 != 1+1;
        boolean ergebnis4 = part1 && part2;

        System.out.println("Ergebnis 4: " + ergebnis4);
    }
}
