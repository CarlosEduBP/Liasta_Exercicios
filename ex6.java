//Aluno: Carlos Eduardo Brigido - 3-54

public class ex6{
    public static void main(String[] args) {
        for(Integer i=1;i<=123;i++){
            if((i%2==0) || (i%3==0)){
                System.out.println(i+" Năo Primo");
            }else{
                System.out.println(i+" Primo");
            }
        }
    }
}