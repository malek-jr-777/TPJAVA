package tp3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Entrez le nombre d'élèves : ");
        int n = input.nextInt();

        double[] notes = new double[n];
        double somme = 0;
        double max, min;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Note de l'élève " + (i + 1) + " (sur 20) : ");
            notes[i] = input.nextDouble();
            somme += notes[i];
        }

       
        max = notes[0];
        min = notes[0];

        
        for (int i = 1; i < n; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
            if (notes[i] < min) {
                min = notes[i];
            }
        }

        
        double moyenne = somme / n;

       
        System.out.println("\n--- Résultats ---");
        System.out.println("Somme des notes : " + somme);
        System.out.println("Note la plus élevée : " + max);
        System.out.println("Note la plus basse : " + min);
        System.out.println("Moyenne de la classe : " + moyenne);

      
    }
}
