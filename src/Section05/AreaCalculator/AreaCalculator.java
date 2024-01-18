package Section05.AreaCalculator;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
    }

    public static double area(double radius){
        if(radius < 0d){
            return -1.0d;
        }
        return radius*radius*Math.PI;
    }

    public static double area(double x, double y){
        if(x < 0d || y < 0d){
            return -1.0d;
        }
        return x*y;

    }


}
