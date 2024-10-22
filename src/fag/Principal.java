package fag;

import java.util.Scanner;
import Objeto.Hotel;

public class Principal {

    public static void main(String[] args) {
        Hotel hotel = new Hotel(); 
        Scanner scan = new Scanner(System.in);
        int escolhaUsuario = 0;

        while (escolhaUsuario != 6) {
            System.out.println("----------------------------");
            System.out.println("MENU");
            System.out.println("Escolha uma opção:");
            System.out.println("[1] Cadastrar Quarto");
            System.out.println("[2] Mostrar Quartos");
            System.out.println("[3] Fazer Reserva");
            System.out.println("[4] Check-out");
            System.out.println("[5] Histórico de Reservas");
            System.out.println("[6] Sair");
            System.out.println("----------------------------");
            escolhaUsuario = scan.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("Número do Quarto: ");
                    int num = scan.nextInt();
                    System.out.println("Tipo do Quarto (Solteiro, Casal, Suíte): ");
                    String tipo = scan.next();
                    System.out.println("Diária: ");
                    double diaria = scan.nextDouble();
                    hotel.cadastrarQuarto(num, tipo, diaria, true);
                    break;

                case 2:
                    hotel.mostrarQuartos();
                    break;

                case 3:
                    System.out.println("Nome do Titular: ");
                    String nome = scan.next();
                    System.out.println("Número do Quarto: ");
                    int numeroQuarto = scan.nextInt();
                    System.out.println("Data de Entrada: ");
                    int entrada = scan.nextInt();
                    System.out.println("Data de Saída: ");
                    int saida = scan.nextInt();
                    hotel.registrarReserva(nome, numeroQuarto, entrada, saida);
                    break;

                case 4:
                    System.out.print("Número do Quarto para Check-out: ");
                    int numCheckOut = scan.nextInt();
                    hotel.realizarCheckOut(numCheckOut);
                    break;

                case 5:
                    hotel.mostrarReservas();
                    break;

                case 6:
                    System.out.println("Sessão Finalizada.");
                    break;

                default:
                    System.out.println("Opção Inválida.");
            }
        }
    }
}
