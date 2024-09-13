public class Point2D {
    private double x;
    private double y;

    // qui place le point à l’origine
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    // Constructeur avec deux coordonnées x et y
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Point2D point) {
        this.x = point.x;
        this.y = point.y;
    }
    // Méthode equals pour comparer deux points
    public boolean equals(Point2D other) {
        if (this == other) {
            return true; // Si les deux objets sont identiques
        }
        // Vérifie si les coordonnées x et y sont égales
        return this.x == other.x && this.y == other.y;
    }

    // Méthode toString pour représenter le point sous forme de chaîne de caractères
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
