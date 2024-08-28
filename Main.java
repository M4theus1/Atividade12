package Atividade12;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Curriculo> pilhaDeCurriculos = new Stack<>();  // Criando uma pilha para armazenar os currículos
        Scanner scanner = new Scanner(System.in);  // Objeto para ler entradas do usuário

        while (true) {  // Laço de repetição para o menu
            System.out.println("\n1. Adicionar Currículo");
            System.out.println("2. Remover Currículo (Topo)");
            System.out.println("3. Pesquisar Currículo");
            System.out.println("4. Exibir Todos os Currículos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer do scanner

            if (opcao == 1) {
                // Adicionar um currículo
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Data de Nascimento: ");
                String dataNascimento = scanner.nextLine();
                System.out.print("Formação: ");
                String formacao = scanner.nextLine();
                System.out.print("Experiências: ");
                String experiencias = scanner.nextLine();
                System.out.print("Nota: ");
                double nota = scanner.nextDouble();

                Curriculo novoCurriculo = new Curriculo(nome, dataNascimento, formacao, experiencias, nota);
                pilhaDeCurriculos.push(novoCurriculo);  // Adiciona o currículo na pilha

            } else if (opcao == 2) {
                // Remover o currículo do topo
                if (!pilhaDeCurriculos.isEmpty()) {
                    Curriculo removido = pilhaDeCurriculos.pop();  // Remove o currículo do topo
                    System.out.println("Currículo removido:\n" + removido);
                } else {
                    System.out.println("A pilha está vazia.");
                }

            } else if (opcao == 3) {
                // Pesquisar um currículo pelo nome
                System.out.print("Digite o nome do currículo a ser pesquisado: ");
                String nomePesquisa = scanner.nextLine();
                boolean encontrado = false;
                for (Curriculo curriculo : pilhaDeCurriculos) {
                    if (curriculo.nome.equalsIgnoreCase(nomePesquisa)) {
                        System.out.println("Currículo encontrado:\n" + curriculo);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Currículo não encontrado.");
                }

            } else if (opcao == 4) {
                // Exibir todos os currículos na pilha
                if (pilhaDeCurriculos.isEmpty()) {
                    System.out.println("A pilha está vazia.");
                } else {
                    for (Curriculo curriculo : pilhaDeCurriculos) {
                        System.out.println(curriculo);
                    }
                }

            } else if (opcao == 5) {
                // Sair do programa
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();  // Fecha o scanner
    }
}
