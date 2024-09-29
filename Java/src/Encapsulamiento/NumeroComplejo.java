package Encapsulamiento;

public class NumeroComplejo {

    private double real;
    private double imaginario;

    public NumeroComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    
    public NumeroComplejo() {
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    @Override
    public String toString() {
        return "NumeroComplejo [real=" + real + ", imaginario=" + imaginario + "]";
    }

    public double suma() {
        return real + imaginario;
    }

    public double resta() {
        return real - imaginario;
    }

    public double producto() {
        return real * imaginario;
    }

    public double division() {
        return real / imaginario;
    }

    public double conjugado() {
        return real - imaginario;
    }
    
}
