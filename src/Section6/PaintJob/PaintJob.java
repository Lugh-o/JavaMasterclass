package Section6.PaintJob;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        int numberOfBuckets = 0;
        double area = width * height;
        numberOfBuckets = (int) (Math.ceil(area / areaPerBucket) - extraBuckets); 

        return numberOfBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return getBucketCount(1, area, areaPerBucket);
    }
 
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, 0.75))  ;
    }
    
}
