public class RectangleCouleur extends Rectangle implements FigureCouleur {
    private String couleur;

    public RectangleCouleur(Point2D hg, Point2D bg, String color) throws IllegalAccessException {
        super(hg, bg);
        this.couleur = color;
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
