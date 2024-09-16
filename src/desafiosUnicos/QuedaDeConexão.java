package desafiosUnicos;

import java.util.Scanner;

public class QuedaDeConexão {
    // TODO: Preencha a função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        int total = 0;
        boolean quedaConexao = false;
        try {
            for (int i = 0; i < velocidades.length; i++) {

                int numeroStr = Integer.parseInt(velocidades[i]);
                if (numeroStr == 0) {
                    quedaConexao = true;
                }
            }
        } catch (NumberFormatException e){
            return ("Erro: formato de número inválido");
        }
            if (quedaConexao == true) {
                return "Queda de Conexao";
            } else {
                return "Sem Quedas";
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
