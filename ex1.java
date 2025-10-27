package tp3;
import java.util.Scanner;
public class ex1 {
	
	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int[] tableau = new int[5];

	        
	        System.out.println("Entrez 5 nombres :");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print("Nombre " + (i + 1) + " : ");
	            tableau[i] = input.nextInt();
	        }

	       
	        System.out.println("\nContenu du tableau :");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print(tableau[i] + " ");
	        }

	        
	        for (int i = 0; i < tableau.length - 1; i++) {
	            for (int j = 0; j < tableau.length - 1 - i; j++) {
	                if (tableau[j] > tableau[j + 1]) {
	                    int aux = tableau[j];
	                    tableau[j] = tableau[j + 1];
	                    tableau[j + 1] = aux;
	                }
	            }
	        }

	        
	        System.out.println("\n\nTableau trié :");
	        for (int i = 0; i < tableau.length; i++) {
	            System.out.print(tableau[i] + " ");
	        }

	       
	    }
	}

