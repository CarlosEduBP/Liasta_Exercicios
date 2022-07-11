//Aluno: Carlos Eduardo Brigido - 3-54
//Programa que calcule o valor das equações:
//
//a. 3-2-1+2+1+3
//b. 2*3-4*5
//c. 2+6-3/7*9
//d. 3%4-8

public class ex3 {
    public static void main(String[] args) {

        Double a, b, c, d;

        a = (double)(3-2-1+2+1+3);
        b = (double)(2*3-4*5);
        c = (double)(2+6-3/7*9);
        d = (double)(3%4-8);

        System.out.println("O resultado da letra A é: "+a);
        System.out.println("O resultado da letra B é: "+b);
        System.out.println("O resultado da letra C é: "+c);
        System.out.println("O resultado da letra D é: "+d);
    }
}