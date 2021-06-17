package entities;

public class FuncionariosL {
    private String name;
    private int id;
    private double salario;

    public FuncionariosL(String name, int id, double salario){
        this.name = name;
        this.id= id;
        this.salario= salario;
    }

    public void aumento(double porcentagem){
        salario = salario+(salario*(porcentagem/100));
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
