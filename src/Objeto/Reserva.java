package Objeto;

public class Reserva {

    private String hospede;
    private String tipoQuarto;
    private Integer dataEntrada;
    private Integer dataSaida;

    public Reserva(String hospede, String tipoQuarto, Integer dataEntrada, Integer dataSaida) {
        this.hospede = hospede;
        this.tipoQuarto = tipoQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Reserva [hospede=" + hospede + ", tipoQuarto=" + tipoQuarto +
               ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + "]";
    }
}
