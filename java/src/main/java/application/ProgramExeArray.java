package application;
import entities.DadosPensão;


import java.util.Arrays;
import java.util.Scanner;

public class ProgramExeArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos farão check-in?");
        int alunos = sc.nextInt();
        DadosPensão[] dados = new DadosPensão[10];
        for(int i=0; i<alunos; i++){
            String t = sc.nextLine();
            System.out.println("Qual é o nome dos alunos?");
            String nome = sc.nextLine();
            System.out.println("Qual é o email?");
            String email = sc.nextLine();
            System.out.println("Qual é o quarto?");
            int quarto = sc.nextInt();
            System.out.println("Qual é valor do aluguel?");
            int valor = sc.nextInt();
            dados[quarto] = new DadosPensão(nome ,  email,  quarto,valor );
        }

        for(int i=0; i< dados.length;i++){
            if(dados[i]!=null){
            System.out.println("Estudante:"+dados[i].getNome()+
                                "\n" +
                                "Número do quarto: " +dados[i].getQuarto()+
                                "\n"
                                +"E-mail: "+dados[i].getEmail()+
                                "\n"
                                +"Valor do quarto escolhido: "+dados[i].getValor());

        }}

    }
}
