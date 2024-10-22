package Objeto;

public class Quarto {

    private Integer numeroQuarto;
    private String tipo;
    private Double preco;
    private Boolean disponivel;

    public Quarto(Integer numeroQuarto, String tipo, Double preco, Boolean disponivel) {
        this.numeroQuarto = numeroQuarto;
        this.tipo = tipo;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Quarto [numeroQuarto=" + numeroQuarto + ", tipo=" + tipo + 
               ", preco=" + preco + ", disponivel=" + disponivel + "]";
    }
}
