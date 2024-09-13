public class CarreCouleur extends Carre implements FigureCouleur {
    private String couleur;

    public CarreCouleur(Point2D hg, double cote, String couleur) {
        super(hg, cote);
        this.couleur = couleur;
    }

    @Override
    public void setCouleur(String color) {
        this.couleur = color;
    }

    @Override
    public String getCouleur() {
        return this.couleur;
    }

}
