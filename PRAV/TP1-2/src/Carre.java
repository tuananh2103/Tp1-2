public class Carre extends Rectangle {
    private Point2D gauche;
    private double cote;

    public Carre() {
        gauche = new Point2D(0, 0);
        cote = 1;
    }

    public Carre(Point2D hg, double cote) {
        this.cote = cote;
        this.gauche = hg;
    }

    @Override
    public Double perimetre() {
        return cote * 4;
    }

    @Override
    public Double surface() {
        return cote * cote;
    }

    public Point2D getGauche() {
        return gauche;
    }

    public void setGauche(Point2D gauche) {
        this.gauche = gauche;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

}
