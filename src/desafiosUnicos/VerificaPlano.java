package desafiosUnicos;

import java.util.Scanner;

public class VerificaPlano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        scanner.close();
        // TODO: Verifique se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (servico.equals(partes[i])) {
                contratado = true;
                break;
            }
        }
        if (contratado == true) System.out.println("sim");
        else {
            System.out.println("não");
        }
    }
}
