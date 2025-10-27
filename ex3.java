package tp3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un nombre n : ");
        int n = input.nextInt();

        int[] tab = new int[n];

        
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j <= i; j++) {
                s = s+ j;
            }
            tab[i] = s;
        }

        
        System.out.println("\nContenu du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.println("tab[" + i + "] = " + tab[i]);
        }

        
    }
}