package Section7.Point;

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(){         
        return distance(0, 0);
    }
    
    public double distance(Point another){
        return distance(another.getX(), another.getY());
    }

    public double distance(int x, int y){
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y- getY()));
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

}
