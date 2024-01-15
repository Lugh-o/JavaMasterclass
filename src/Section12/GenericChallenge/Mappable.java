package Section12.GenericChallenge;
import java.util.Arrays;

public interface Mappable {
    void render();

    static double[] stringToLatLon(String string) {
        double[] latLon = new double[2];
        String[] convertedInput = string.split(",");
        
        for(int i = 0; i < latLon.length; i++){
            latLon[i] = Double.parseDouble(convertedInput[i].trim());
        }
        return latLon;
    }
}

abstract class Point implements Mappable {
    private double[] location = new double[2];
    
    public Point(String string){
        this.location = Mappable.stringToLatLon(string);
    }

    private String location(){
        return Arrays.toString(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Point (" + location() + ")");
        
    }
    
}

abstract class Line implements Mappable {
    private double[][] locations = new double[3][2];

    public Line(String... locations){
        this.locations = new double[locations.length][];
        int index = 0;
        for(var l : locations){
            this.locations[index++] = Mappable.stringToLatLon(l);
        }
    }

    private String locations(){
        return Arrays.deepToString(locations);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Line (" + locations() + ")");
        
    }


    
}

