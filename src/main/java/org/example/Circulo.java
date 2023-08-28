package org.example;

public class Circulo {

    private double Radio;
    private int CalcularArea;

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public int getCalcularArea() {
        return CalcularArea;
    }

    public void setCalcularArea(int calcularArea) {
        CalcularArea = calcularArea;
    }
    public double CalcularArea(){
    Double Area;

    Area = this.Radio*this.Radio*3.1416;
    return Area;
    }
}
