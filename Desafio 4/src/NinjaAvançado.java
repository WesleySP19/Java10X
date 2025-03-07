public class NinjaAvançado implements Ninja {
    private String nome;
    private int idade;
    private TipoHabilidade habilidade;
    private String especialidade;

    public NinjaAvançado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade +
                ", Habilidade: " + habilidade + ", Especialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " está usando " + habilidade +
                " com a especialidade: " + especialidade);
    }
}