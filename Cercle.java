package TP4;



public class Cercle {

    Point centre;
    Double rayon;

    public Cercle(Point centre, Double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Double perimetre() {
        return 2 * Math.PI * rayon;
    }

    public Double surface() {
        return Math.PI * rayon * rayon;
    }

    public void afficher() {
        System.out.println("Centre : (" + centre.ab+ " , " + centre.ord + ")");
        System.out.println("Rayon : " + rayon);
        System.out.println("Perimetre : " + perimetre());
        System.out.println("Surface : " + surface());
    }
}
