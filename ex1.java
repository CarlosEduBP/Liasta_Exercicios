// Carlos Eduardo Brigido 3-51
package ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Double kginput, kg, libinput, lib;

        System.out.print("Digite a Quantidade de Quilos: ");
        kginput = input.nextDouble();

        System.out.print("Digite a Quantidade de libras: ");
        libinput = input.nextDouble();

        kg = librasinput*0.454;
        lib = quilosinput/0.454;

        System.out.println(kginput+" kg = "+lib+" lib");
        System.out.println(libinput+" lib = "+kg+" kg");
    }        
}