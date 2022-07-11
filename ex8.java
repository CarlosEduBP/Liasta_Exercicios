//Aluno: Carlos Eduardo Brigido - 3-54



import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double h, slario;

        System.out.print("Digite a quantidade de horas trabalhadas: ");    
        h = input.nextDouble();

        slario = h * 10.25;

        System.out.print("O valor do salário será de: R$"+slario);
    }
}