public class Rectangle {
    private Point2D hg;
    private Point2D bd;

    // Exception a refaire une methode
    public Rectangle(Point2D hg, Point2D bd) throws IllegalAccessException {
        try {
            verifier();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.hg = hg;
        this.bd = bd;
    }

    public Rectangle() {
        this.hg = new Point2D(0, 0);
        this.bd = new Point2D(1, 1);
    }

    // Cloner
    public Rectangle(Rectangle rectangle) {
        this.hg = new Point2D(rectangle.hg.getX(), rectangle.hg.getY());
        this.bd = new Point2D(rectangle.bd.getX(), rectangle.bd.getY());
    }

    public void verifier() {
        if (hg.getX() > bd.getX() | hg.getY() < bd.getY()) {
            throw new IllegalArgumentException(
                    "Le coin inférieur droit est toujours dessous et à droite du coin supérieur gauche");
        }
    }

    public Double largeur() {
        return bd.getX() - hg.getX();
    }

    public Double hauteur() {
        return bd.getY() - hg.getY();
    }

    public Double perimetre() {
        return 2 * (hauteur() + largeur());
    }

    public Double surface() {
        return hauteur() * largeur();
    }

    // getters setters
    public Point2D getBd() {
        return bd;
    }

    public void setBd(Point2D bd) {
        this.bd = bd;
    }

    public Point2D getHg() {
        return hg;
    }

    public void setHg(Point2D hg) {
        this.hg = hg;
    }

}
