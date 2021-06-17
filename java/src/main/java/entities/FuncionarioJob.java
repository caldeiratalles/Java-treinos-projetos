package entities;

import entities.enums.Level;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioJob {
    private String departamento;
    private String nome;
    private Level level;
    private String data;
    private String contrato;
    private Integer salario;



    public FuncionarioJob(String departamento, String nome, Level level, String data, String contrato, Integer salario) {
        this.departamento = departamento;
        this.nome = nome;
        this.level = level;
        this.data = data;
        this.contrato = contrato;
        this.salario = salario;
    }
    public SimpleDateFormat FormatData(String data){
        SimpleDateFormat d1= new SimpleDateFormat(data);
        return d1;
    }
    public List calculo(int aux){
        List lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<aux; i++){
            int sum = 0;
            System.out.println("Contrato número: "+(i+1)+"#");
            System.out.println("Duração do contrato em horas: ");
            Integer horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            Integer valor_per = sc.nextInt();
            sum = horas*valor_per;
            lista.add(valor_per);
            lista.add(horas);
            lista.add(sum);





        }


        return lista;
    }
    public void transform (String data){

    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}
