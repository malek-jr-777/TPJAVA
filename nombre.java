package tpex2;


import java.util.Scanner;

public class nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre entier : ");
        String entree = sc.nextLine();

        try {
            int nombre = Integer.parseInt(entree);
            System.out.println("Le nombre saisi est : " + nombre);

            if (nombre % 2 == 0) {
                System.out.println("Le nombre est pair.");
            } else {
                System.out.println("Le nombre est impair.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erreur : la saisie n'est pas un nombre entier !");
        }

        sc.close();
    }
}


