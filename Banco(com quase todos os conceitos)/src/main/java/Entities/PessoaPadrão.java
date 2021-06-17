package Entities;

import Entities.enums.Status;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class PessoaPadrão extends Pessoa{
    private String banco;
    private Double salario;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public PessoaPadrão(String nome, String sexo, String email, Calendar data, Status status, String banco, Double salario) {
        super(nome, sexo, email, data, status);
        this.banco = banco;
        this.salario = salario;
    }

    @Override
    public String toString() {
        String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(data);
        return "PessoaPadrão{" +
                "\n nome='" + nome + '\'' +
                "\n sexo='" + sexo + '\'' +
                "\n email='" + email + '\'' +
                "\n data=" + dStr +
                "\n status=" + status +
                "\n banco='" + banco + '\'' +
                "\n salario=" + salario;
    }
}
