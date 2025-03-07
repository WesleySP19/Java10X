public class NinjaBásico implements Ninja {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;

    public NinjaBásico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está usando " + habilidade);
    }
}