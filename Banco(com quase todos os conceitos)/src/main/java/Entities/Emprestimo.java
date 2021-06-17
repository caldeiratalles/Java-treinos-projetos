package Entities;

public class Emprestimo {
    private double emprestimo;
    private double limite;
    private double taxa;


    public Emprestimo(double emprestimo, double limite, double taxa) {
        this.emprestimo = emprestimo;
        this.limite = limite;
        this.taxa = taxa;
    }

    public double p_Emprestimo(double emprestimo, double limite, double taxa){
        double aux = 0;
        if(emprestimo<=limite){
            if(taxa>5){
                aux = emprestimo * (taxa / 100);
            }

        }else{
             aux = -1;
        }
        return aux;

    }

    @Override
    public String toString() {
        return "Emprestimo\n" +
                "emprestimo=" + emprestimo +
                "\n limite=" + limite +
                "\n taxa=" + taxa;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
