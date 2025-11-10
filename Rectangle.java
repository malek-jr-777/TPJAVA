package TP4;
public class Rectangle {

    Double longueur;
    Double largeur;

    public Rectangle(Double longueur, Double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Double surface() {
        return longueur * largeur;
    }

    public Double perimetre() {
        return 2 * (longueur + largeur);
    }

    public void afficher() {
        System.out.println("longueur = " + longueur);
        System.out.println("largeur  = " + largeur);
        System.out.println("surface  = " + surface());
        System.out.println("perimetre = " + perimetre());
    }
}
