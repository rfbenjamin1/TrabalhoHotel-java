package Objeto;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Quarto> quartos = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public void cadastrarQuarto(int numero, String tipo, double preco, boolean disponivel) {
        Quarto quarto = new Quarto(numero, tipo, preco, disponivel);
        quartos.add(quarto);
        System.out.println("Quarto cadastrado com sucesso!");
    }

    public void mostrarQuartos() {
        if (quartos.isEmpty()) {
            System.out.println("Nenhum quarto cadastrado.");
        } else {
            System.out.println("Lista de Quartos:");
            for (Quarto q : quartos) {
                System.out.println(q);
            }
        }
    }

    public void registrarReserva(String hospede, int numeroQuarto, int entrada, int saida) {
        for (Quarto q : quartos) {
            if (q.getNumeroQuarto() == numeroQuarto && q.getDisponivel()) {
                q.setDisponivel(false);
                Reserva reserva = new Reserva(hospede, q.getTipo(), entrada, saida);
                reservas.add(reserva);
                System.out.println("Reserva registrada com sucesso!");
                return;
            }
        }
        System.out.println("Erro: Quarto não disponível ou não encontrado.");
    }

    public void realizarCheckOut(int numeroQuarto) {
        for (Quarto q : quartos) {
            if (q.getNumeroQuarto() == numeroQuarto && !q.getDisponivel()) {
                q.setDisponivel(true);
                System.out.println("Check-out realizado no Quarto " + numeroQuarto);
                return;
            }
        }
        System.out.println("Erro: Quarto não encontrado ou já está disponível.");
    }

    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva registrada.");
        } else {
            System.out.println("Histórico de Reservas:");
            for (Reserva r : reservas) {
                System.out.println(r);
            }
        }
    }
}
