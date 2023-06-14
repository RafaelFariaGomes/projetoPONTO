public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracao;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do Titulo: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Avaliação deste Titulo: " + somaAvaliacoes);
    }
    void avalia(double nota){
        somaAvaliacoes += nota;
        totalAvaliacoes++;

    }

    double mediaAvaliacoes(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
