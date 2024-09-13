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
