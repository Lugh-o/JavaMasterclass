package Section07.ComplexOperations;

public class ComplexNumber{
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number){
        double a = number.getReal();
        double b = number.getImaginary();
        add(a, b);
    }   

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number){
        double a = number.getReal();
        double b = number.getImaginary();
        subtract(a, b);
    }   

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    
}