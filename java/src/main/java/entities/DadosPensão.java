package entities;

public class DadosPensão {
    private String nome;
    private String email;
    private int valor;
    private int quarto;

    public DadosPensão(String nome, String email, int valor, int quarto) {
        this.nome = nome;
        this.email = email;
        this.valor = valor;
        this.quarto = quarto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }
}
