import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaFuncionarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem-vindo! Sistema Cadastral de Funcionários\n");

        //Criação de HashMap para receber lista de funcionários
        Map<String, String> funcionarios = new HashMap<String, String>();

        //Entrada dos dados para um funcionário
        System.out.println("Se deseja CADASTRAR um funcionário, entre com os dados abaixo. ");
        System.out.println("Entre com o nome do Funcionário: ");
        String nomeDoFuncionario = teclado.nextLine();
        System.out.println("Entre com o CPF do Funcionário: ");
        String cpf = teclado.nextLine();
        System.out.println("Entre com o telefone do Funcionário: ");
        String telefone = teclado.nextLine();
        System.out.println("Entre com o email do Funcionário: ");
        String email = teclado.nextLine();
        funcionarios.put(cpf, " Nome: " + nomeDoFuncionario + ". Telefone: " + telefone + ". E-mail: " + email);
        System.out.println(" ");
        System.out.println("Usuário Cadastrado. Operação realizada com sucesso.");
        //Estrutura para saída melhor formatada
        for (String referencia : funcionarios.values()) {
            System.out.println(referencia);
        }
        //Entrega mínima

    }
}