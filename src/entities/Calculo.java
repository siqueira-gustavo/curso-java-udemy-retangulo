package entities;

public class Calculo {
    public double base;
    public double altura;

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
}
