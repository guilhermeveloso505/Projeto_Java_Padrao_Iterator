package Iterator;

public class Cliente {

    private String nome;
    private boolean cadastrado;

    public Cliente(String nome, boolean cadastrado) {
        this.nome = nome;
        this.cadastrado = cadastrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCadastrado() { return cadastrado; }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }
}
