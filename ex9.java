//Aluno: Carlos Eduardo Brigido - 3-54



import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double h, slario;

        System.out.print("Digite quantas horas foram trablahadas: ");
        horas = input.nextDouble();

        slario = h*10.25;

        if(slario < 50){
            System.out.println("Atenção, dirija-se em direção do Hotel!");
        }else{
            System.out.print("O valor do salário será de: R$"+slario);
        }
    }    
}