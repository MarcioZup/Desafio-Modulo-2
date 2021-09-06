import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaFuncionarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem-vindo! Sistema Cadastral de Funcionários\n");
        System.out.println("Escolha uma das opções abaixo e digite o número correspondente: \n");
        Map<String, String> funcionarios = new HashMap<String, String>();
        int opcaoDigitada = 0;
        boolean looping = true;

        //Menu para escolha de entrada, listagem ou saída do sistema
        while (looping == true) {
            System.out.println("Se deseja CADASTRAR um funcionário, digite 1. ");
            System.out.println("Se deseja MOSTRAR o(s) funcionário(s) cadastrados, digite 2. ");
            System.out.println("Se deseja SAIR, digite 3. ");
            System.out.println(" ");
            System.out.println("Digite a opção desejada: ");

            opcaoDigitada = teclado.nextInt();

            //Menu de escolha com validação
            switch (opcaoDigitada) {
                case 1: {
                    teclado.nextLine();
                    System.out.println("Entre com o nome do Funcionário: ");
                    String nomeDoFuncionario = teclado.nextLine();
                    System.out.println("Entre com o CPF do Funcionário: ");
                    String cpf = teclado.nextLine();
                    while(funcionarios.containsKey(cpf)) {
                        System.out.println("Esse CPF já está cadastrado no sistema. Digite o CPF do novo funcionário: ");
                        cpf = teclado.nextLine();
                        }
                    System.out.println("Entre com o telefone do Funcionário: ");
                    String telefone = teclado.nextLine();
                    System.out.println("Entre com o email do Funcionário: ");
                    String email = teclado.nextLine();
                    funcionarios.put(cpf, "Nome: " + nomeDoFuncionario + ". Telefone: " + telefone + ". E-mail: " + email);
                    System.out.println(" ");
                    System.out.println("Usuário Cadastrado. Operação realizada com sucesso.");
                    break;
                    }
                case 2: {
                    for (String referencia : funcionarios.keySet()) {
                        System.out.println(funcionarios.get(referencia) + ". CPF: " + referencia);
                    }
                    break;
                }
                case 3: {
                    looping = false;
                    System.out.println("Você saiu do sistema");
                    break;
                }
                default: {
                    System.out.println("Digite uma opção válida.\n");
                    break;
                }
            }
        }

        teclado.close();
    }
}
//Criação de Menu para Inserção de funcionário, listagem dos cadastrados com seus dados e saída do sistema
//Entrega Média