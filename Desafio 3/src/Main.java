import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ninja> ninjas = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menu de Gerenciamento de Ninjas ---");
            System.out.println("1. Adicionar Ninja");
            System.out.println("2. Adicionar Uchiha");
            System.out.println("3. Exibir Informações de Todos os Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Missão: ");
                    String missao = scanner.nextLine();
                    System.out.print("Nível de Dificuldade: ");
                    String nivelDificuldade = scanner.nextLine();
                    System.out.print("Status da Missão: ");
                    String statusMissao = scanner.nextLine();

                    ninjas.add(new Ninja(nome, idade, missao, nivelDificuldade, statusMissao));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Missão: ");
                    missao = scanner.nextLine();
                    System.out.print("Nível de Dificuldade: ");
                    nivelDificuldade = scanner.nextLine();
                    System.out.print("Status da Missão: ");
                    statusMissao = scanner.nextLine();
                    System.out.print("Habilidade Especial: ");
                    String habilidadeEspecial = scanner.nextLine();

                    ninjas.add(new Uchiha(nome, idade, missao, nivelDificuldade, statusMissao, habilidadeEspecial));
                    break;

                case 3:
                    for (Ninja ninja : ninjas) {
                        ninja.mostrarInformacoes();
                        System.out.println("-----------------------------");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}