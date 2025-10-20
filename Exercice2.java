package tp1ex5;
import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maxSalaire = 0;

        while (true) {
            System.out.print("Nom: ");
            String nom = sc.next();
            System.out.print("Prénom: ");
            String prenom = sc.next();
            System.out.print("Âge: ");
            int age = sc.nextInt();
            System.out.print("Salaire: ");
            double salaire = sc.nextDouble();

            if (salaire > maxSalaire)
                maxSalaire = salaire;

            System.out.print("Voulez-vous ajouter un autre employé ? (oui/non): ");
            String rep = sc.next();

            if (rep.equalsIgnoreCase("non"))
                break;
        }

        System.out.println("Le salaire le plus grand est: " + maxSalaire);
        sc.close();
    }
}
