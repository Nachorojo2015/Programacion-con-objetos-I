package Encapsulamiento;

import java.util.ArrayList;

public class Fraccion {


    private int numerador = 0;
    private int denominador = 1;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Denominador no puede ser 0");
        } else {
            this.denominador = denominador;
        }
        this.numerador = numerador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    
    @Override
    public String toString() {
        return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
    }

    public double ftor() {
        return (double) numerador / denominador;
    }

    public void reducir() {
        int mcd = mcd(numerador, denominador);
        
        if (mcd != 0) {
            numerador /= mcd;
            denominador /= mcd;
            System.out.println(numerador + "/" + denominador);
        } else {
            System.out.println("No se puede reducir la fraccion");
        }
    }

    public int mcd(double numerador, double denominador) {
        ArrayList<Integer> divisoresNumerador = new ArrayList<Integer>();
        ArrayList<Integer> divisoresDenominador = new ArrayList<Integer>();

        for (int i = 2; i <= numerador; i++) {
            if ((numerador / i ) % 1 == 0) {
                divisoresNumerador.add(i);
            }
        }

        for (int j = 2; j <= denominador; j++) {
            if ((denominador / j) % 1 == 0) {
                divisoresDenominador.add(j);
            }
        }

        System.out.println(divisoresNumerador);
        System.out.println(divisoresDenominador);

        int mcd = 0;

        if (divisoresNumerador.size() > divisoresDenominador.size()) {
            for (int i = 0; i < divisoresNumerador.size(); i++) {
                for (int j = 0; j < divisoresDenominador.size(); j++) {
                    if (divisoresNumerador.get(i) == divisoresDenominador.get(j)) mcd = divisoresNumerador.get(i);
                }
            }
        } else {
            for (int i = 0; i < divisoresDenominador.size(); i++) {
                for (int j = 0; j < divisoresNumerador.size(); j++) {
                    if (divisoresDenominador.get(i) == divisoresNumerador.get(j)) mcd = divisoresDenominador.get(i);
                }
            }
        }

        System.out.println(mcd);

        return mcd;
    }

    public static void main(String[] args) {
        Fraccion f = new Fraccion(21, 3);

        f.reducir();

        System.out.println(f.ftor());
    }
}
