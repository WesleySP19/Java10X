import java.util.Scanner;

public class NinjaRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[100];
        int count = 0;

        while (true) {
            System.out.println("\n--- Sistema de Cadastro de Ninjas ---");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas Cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (count < ninjas.length) {
                        System.out.print("Digite o nome do ninja: ");
                        String nome = scanner.nextLine();
                        ninjas[count] = nome;
                        count++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de ninjas cadastrados atingido!");
                    }
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        System.out.println("\n--- Lista de Ninjas Cadastrados ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
