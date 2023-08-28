package org.example;

public class Rectangulo {

    private double Lado1;
    private double Lado2;
    private int CalcularArea;

    public double getLado1() {
        return Lado1;
    }

    public void setLado1(double lado1) {
        Lado1 = lado1;
    }

    public double getLado2() {
        return Lado2;
    }

    public void setLado2(double lado2) {
        Lado2 = lado2;
    }

    public int getCalcularArea() {
        return CalcularArea;
    }

    public void setCalcularArea(int calcularArea) {
        CalcularArea = calcularArea;
    }
    public double CalcularAreaR(){
        Double AreaR;

        AreaR = this.Lado1*this.Lado2;
        return AreaR;
    }
}
