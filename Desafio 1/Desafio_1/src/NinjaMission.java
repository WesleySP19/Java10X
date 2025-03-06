// Classe que representa uma Missão
class Missao {
    private String nome;
    private char nivelDificuldade;
    private String status;

    public Missao(String nome, char nivelDificuldade) {
        this.nome = nome;
        this.nivelDificuldade = nivelDificuldade;
        this.status = "não concluída"; // Status inicial
    }

    // Getters e Setters
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

// Classe que representa um Ninja
class Ninja1 {
    private String nome;
    private int idade;
    private Missao missao;

    public Ninja1(String nome, int idade, Missao missao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
    }

    // Getters
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

// Classe principal que contém a lógica do programa
public class NinjaMission {
    public static void main(String[] args) {
        // Criando as missões
        Missao missao1 = new Missao("Resgate do Gato", 'C');
        Missao missao2 = new Missao("Captura do Bandido", 'B');
        Missao missao3 = new Missao("Entrega de Mensagem", 'D');

        // Criando os ninjas com suas missões
        Ninja1 naruto = new Ninja1("Naruto", 12, missao1);
        Ninja1 sasuke = new Ninja1("Sasuke", 12, missao2);
        Ninja1 sakura = new Ninja1("Sakura", 12, missao3);

        // Verificando se as missões podem ser concluídas
        verificarConclusaoMissao(naruto);
        verificarConclusaoMissao(sasuke);
        verificarConclusaoMissao(sakura);

        // Imprimindo os dados dos ninjas
        imprimirDadosNinja(naruto);
        imprimirDadosNinja(sasuke);
        imprimirDadosNinja(sakura);
    }

    // Método para verificar se o ninja pode concluir a missão
    public static void verificarConclusaoMissao(Ninja1 ninja) {
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

    // Método para imprimir os dados do ninja
    public static void imprimirDadosNinja(Ninja1 ninja) {
        System.out.println("Ninja: " + ninja.getNome() +
                ", Idade: " + ninja.getIdade() +
                ", Missão: " + ninja.getMissao().getNome() +
                ", Nível: " + ninja.getMissao().getNivelDificuldade() +
                ", Status: " + ninja.getMissao().getStatus());
    }
}
