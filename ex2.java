package tp3;


import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] tab = {3, 7, 2, 7, 9, 5, 7}; 

        System.out.print("Entrez un entier à rechercher : ");
        int nombre = input.nextInt();

        int indice=-1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nombre) {
                 indice = i; 
            }
        }

        
        if (indice != -1) {
            System.out.println("L’entier " + nombre + " se trouve à l’indice : " + indice);
        } else {
            System.out.println("L’entier " + nombre + " n’existe pas dans le tableau.");
        }

       
    }
}