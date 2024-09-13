public class PointCouleur extends Point2D implements FigureCouleur {
    private String nameCouleur;

    public PointCouleur() {
        super(0, 0);
        this.nameCouleur = "noir"; // default value
    }

    public PointCouleur(String c) {
        this.nameCouleur = c;
    }

    public PointCouleur(Point2D point) {
        super(point.getX(), point.getY());
        this.nameCouleur = "noir";
    }

    public PointCouleur(Point2D point, String c) {
        super(point.getX(), point.getY());
        this.nameCouleur = c;
    }

    // Constructeur de recopie
    public PointCouleur(PointCouleur autre) {
        super(autre.getX(), autre.getY());
        this.nameCouleur = autre.getNameCouleur();
    }

    public String getNameCouleur() {
        return nameCouleur;
    }

    public void setNameCouleur(String nameCouleur) {
        this.nameCouleur = nameCouleur;
    }

    @Override
    public void setCouleur(String color) {
        this.nameCouleur = color;
    }

    @Override
    public String getCouleur() {
        return this.nameCouleur;
    }

}