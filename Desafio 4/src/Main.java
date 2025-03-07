public class Main {
    public static void main(String[] args) {
        Ninja basico = new NinjaBásico("Naruto", 16, TipoHabilidade.NINJUTSU);
        Ninja avancado = new NinjaAvançado("Sasuke", 16, TipoHabilidade.KATON, "Chidori");

        basico.mostrarInformacoes();
        basico.executarHabilidade();

        avancado.mostrarInformacoes();
        avancado.executarHabilidade();
    }
}