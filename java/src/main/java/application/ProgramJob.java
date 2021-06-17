package application;

import entities.DadosPensão;
import entities.FuncionarioJob;
import entities.enums.Level;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class ProgramJob {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o departamento: ");//poderia ter um banco para buscar e validar a existencia
        String departamento = sc.nextLine();
        System.out.println("Digite o nome: ");//poderia ter um banco para buscar e validar o nome desse funcionario
        String nome = sc.nextLine();
        System.out.println("Digite o nível: ");
        String t = sc.nextLine();//poderia colocar um if para validar se existe
        System.out.println("Digite a data usando essa forma dd/mm/yyyy");
        String data = sc.nextLine();
        System.out.println("Quantos contratos esse funcionario possui: ");
        String aux = sc.nextLine();
        Integer aux1 = Integer.parseInt(aux);
        System.out.println("Digite o salario base: ");
        Integer salario = sc.nextInt();
        FuncionarioJob F1 = new FuncionarioJob(departamento,nome,Level.PLENOR,data,aux,salario);
        List listas = F1.calculo(aux1);
        System.out.println("------------------------------------------------");
        System.out.println("Departamento: "+F1.getDepartamento());
        System.out.println("Funcionario: "+F1.getNome());
        System.out.println("Salario: "+F1.getSalario());

        for(int i=0; i<=aux1; i++){
            System.out.println("---------------------------");
            System.out.println("Contrato: "+(i+1));
            int j = 0;
            while(!(j==(listas.size()/aux1))) {
                System.out.println("Valor por hora: " + listas.get(j));
                j+=1;
                System.out.println("Horas do contrato:" + listas.get(j));
                j+=1;
                System.out.println("Valor a receber de contrato: "+listas.get(j)+" e valor base do salario "+F1.getSalario());
                j+=1;
                System.out.println("---------------------------");
            }
        }


    }
}
