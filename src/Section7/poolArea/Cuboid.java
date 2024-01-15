package Section7.poolArea;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height){
        super(width, length);
        if(height < 0) height = 0;
        this.height = height;
    }

    public double getVolume(){
        return height * getArea();
    }

    public double getHeight() {
        return height;
    }

}
