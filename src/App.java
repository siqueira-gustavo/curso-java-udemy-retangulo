import java.util.Locale;
import java.util.Scanner;

import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculo calculo = new Calculo();
        System.out.println("Informe a base e a altura do retângulo:");
        calculo.base = sc.nextDouble();
        calculo.altura = sc.nextDouble();
        System.out.printf("Área: %.2f\n", calculo.calcularArea());
        System.out.printf("Perímetro: %.2f\n", calculo.calcularPerimetro());
        System.out.printf("Diagonal: %.2f\n", calculo.calcularDiagonal());

        sc.close();
    }
}