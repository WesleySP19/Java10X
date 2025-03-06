import java.util.ArrayList;
import java.util.Scanner;

class Missao {
    private String nome;
    private char nivelDificuldade;
    private String status;

    public Missao(String nome, char nivelDificuldade) {
        this.nome = nome;
        this.nivelDificuldade = nivelDificuldade;
        this.status = "não concluída"; // Status inicial
    }


    public String getNome() {
        return nome;
    }

    public char getNivelDificuldade() {
        return nivelDificuldade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}


class Ninja {
    private String nome;
    private int idade;
    private Missao missao;

    public Ninja(String nome, int idade, Missao missao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Missao getMissao() {
        return missao;
    }
}

public class NinjaMission {
    private static ArrayList<Ninja> ninjas = new ArrayList<>(); // Lista de ninjas
    private static Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar Ninja");
            System.out.println("2. Listar Ninjas e Missões");
            System.out.println("3. Verificar Conclusão de Missões");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarNinja();
                    break;
                case 2:
                    listarNinjas();
                    break;
                case 3:
                    verificarTodasMissoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void adicionarNinja() {
        System.out.print("Digite o nome do ninja: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do ninja: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da missão: ");
        String nomeMissao = scanner.nextLine();

        System.out.print("Digite o nível de dificuldade da missão (A, B, C, D): ");
        char nivelDificuldade = scanner.nextLine().charAt(0);

        Missao missao = new Missao(nomeMissao, nivelDificuldade);
        Ninja ninja = new Ninja(nome, idade, missao);


        ninjas.add(ninja);
        System.out.println("Ninja adicionado com sucesso!");
    }

    public static void listarNinjas() {
        if (ninjas.isEmpty()) {
            System.out.println("Nenhum ninja cadastrado!");
        } else {
            for (Ninja ninja : ninjas) {
                System.out.println("Ninja: " + ninja.getNome() +
                        ", Idade: " + ninja.getIdade() +
                        ", Missão: " + ninja.getMissao().getNome() +
                        ", Nível: " + ninja.getMissao().getNivelDificuldade() +
                        ", Status: " + ninja.getMissao().getStatus());
            }
        }
    }

    public static void verificarTodasMissoes() {
        for (Ninja ninja : ninjas) {
            verificarConclusaoMissao(ninja);
        }
        System.out.println("Status das missões atualizados!");
    }

    public static void verificarConclusaoMissao(Ninja ninja) {
        Missao missao = ninja.getMissao();
        int idade = ninja.getIdade();
        char nivelDificuldade = missao.getNivelDificuldade();

        if (idade < 15 && (nivelDificuldade == 'C' || nivelDificuldade == 'D')) {
            missao.setStatus("concluída");
        } else if (idade >= 15) {
            missao.setStatus("concluída");
        } else {
            missao.setStatus("não concluída");
        }
    }
}