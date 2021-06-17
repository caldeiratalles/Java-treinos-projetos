package Program;

import Entities.PessoaNegativada;
import Entities.PessoaPadrão;
import Entities.enums.Status;
import Entities.Emprestimo;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String banco = "-1";
        System.out.println("##################################");
        System.out.println("Bem-vindo ao serviço de cadastro!!");
        System.out.println("##################################");
        System.out.println("Entre com os dados do usuario");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Sexo: ");
        String sexo = sc.nextLine();
        System.out.println("E-mail: ");
        String email = sc.nextLine();
        System.out.println("Irei setar a data de hoje, verifique a data antes de continuar dd/mm/yyyy");
        Calendar data = Calendar. getInstance();
        System.out.println("Entre com o status do usuario");
        String status = sc.nextLine();
        System.out.println("Entre com o salario:");
        double salario = sc.nextDouble();
        for(int i = 5; i<50 ; i++){

                String result = new String(new char[i]).replace("\0", "#");
                System.out.println(i+"%"+"("+result+")");

        }


            PessoaNegativada pn1 = new PessoaNegativada(name,sexo,email,data,Status.valueOf(status),banco,salario);
            PessoaPadrão p1 = new PessoaPadrão(name,sexo,email,data, Status.valueOf(status),banco,salario);
            pn1.abrirConta(banco);
            p1.abrirConta(banco);


        System.out.println("Conta criado com sucesso, deseja fazer outra operação? ");

        String x = sc.nextLine();
        String xss = sc.nextLine();

        if(xss.equals("s")){
            System.out.println("Escolha a operação desejada \n 1-Deposito \n 2-Saque \n 3-Emprestimo");
            int xs = sc.nextInt();
            switch (xs){
                case 1:
                    System.out.println("Digite o valor:");
                    double salarios = sc.nextDouble();
                    if(banco == "-1"){pn1.addSalario(salarios);
                        System.out.println(pn1.toString());}
                    else{p1.addSalario(salarios);
                        System.out.println(p1.toString());}

                    break;
                case 2:
                    System.out.println("Digite o valor:");
                    double removesalario = sc.nextDouble();
                    if(banco == "-1"){pn1.removeSalario(removesalario);
                        System.out.println(pn1.toString());}
                    else{p1.removeSalario(removesalario);
                        System.out.println(p1.toString());}
                    break;
                case 3:
                    System.out.println("Verificando a taxa de emprestimo");
                    System.out.println("Valor do emprestimo");
                    double emprestimo = sc.nextDouble();
                    System.out.println("limite atual");
                    double limite = sc.nextDouble();
                    System.out.println("taxa");
                    double taxa = sc.nextDouble();
                    if(status == "Negativado"){
                        Emprestimo e1 = new Emprestimo(emprestimo,limite,taxa);
                        e1.p_Emprestimo(emprestimo,limite,taxa);
                        System.out.println("Emprestimo negado");}
                    else{Emprestimo e1 = new Emprestimo(emprestimo,limite,taxa);
                        e1.p_Emprestimo(emprestimo,limite,taxa);
                        System.out.println(e1.toString());}
                    break;

            }

        }
    }
}
