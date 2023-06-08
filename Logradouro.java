package T2;

public class Logradouro {
    private String tipo;
    private String nome;
    public Logradouro anterior;
    public Logradouro proximo;
    public Logradouro(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
