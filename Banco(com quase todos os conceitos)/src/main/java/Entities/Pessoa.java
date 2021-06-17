package Entities;

import Entities.enums.Status;

import java.util.Calendar;
import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected String sexo;
    protected String email;
    public Calendar data;
    protected Status status;
    protected double salario;
    protected String banco;


    public Pessoa(String nome, String sexo, String email, Calendar data, Status status) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.data = data;
        this.status = status;
    }



    public double addSalario(double salarioAdd){
        salario = salarioAdd+salario;
        return salario;
    }
    public double removeSalario(double salarioRm){
        if(salario - salarioRm>=0){salario = salario - salarioRm;}
        else{
            salario = salario;
        }
        return salario;
    }
    public void abrirConta(String banco) {
        if(!(banco=="-1")){
            setBanco("Banco positivo");
        }else{
            setBanco("Banco para negativado");
        }
        addSalario(salario);
    }








    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
