package org.example;

public class Main extends Circulo {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        circulo1.setRadio(5);
        System.out.println("Area: "+circulo1.CalcularArea());

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setLado1(4);
        rectangulo1.setLado2(8);
        System.out.println("Area: "+rectangulo1.CalcularAreaR());

    }
}