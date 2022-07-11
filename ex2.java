//Aluno: Carlos Eduardo Brigido - 3-54


import java.util.Scanner;

public class ex2{ public static void main(String[] args) {
                  Scanner input = new Scanner(System.in);

        Double h, b, B, area;

        System.out.print("Digite a altura do trapézio: ");
        h = input.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        b = input.nextDouble();

        System.out.print("Digite a base maior do trapézio: ");
        B = input.nextDouble();

        area = (h*(b+B))/2;

        System.out.println("A área do trapézio é: "+area);

        System.out.println("O valor inteiro da área é: "+area.intValue());
    }
}