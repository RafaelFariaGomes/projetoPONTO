public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Filme f){
        tempoTotal += f.getDuracao();
    }
}
