package com.example;

public class Triangulo {
private double base;
private  double altura;

public Triangulo() {
}

public Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
}

public double calcArea() {
    return ((base * altura)/2);
}

public double calcPerimetro (){
    double lado = Math.sqrt(Math.pow(base/2,2) + Math.pow(altura, 2));
    return 3 * lado;
}

public double getBase() {
    return base;
}

public void setBase(double base) {
    this.base = base;
}

public double getAltura() {
    return altura;
}

public void setAltura(int altura) {
    this.altura = altura;
} 

}

