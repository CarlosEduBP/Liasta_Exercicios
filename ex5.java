//Aluno: Carlos Eduardo Brigido - 3-54

public class ex5{
    public static void main(String[] args) {

        Integer total=0;
        Long i=(long) 1;

        for(int i=1;i<30;i++){
            if((i%2)==1){
                soma += i;
            }else{
                multi *= i;
            }
        }
        System.out.print("O valor da soma sequencial é de: "+total+"\n");
        System.out.print("O valor da multiplicação sequencial é de: "+i+"\n");
    }
} 