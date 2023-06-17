public class Musicas extends Audio{
    private String cantor;
    private String DJ;
    private String letra;

    @Override
    public void fichaTecnicaAudio() {
        super.fichaTecnicaAudio();
        System.out.println("DJ: " + getDJ());
    }

    public String getDJ() {
        return DJ;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setDJ(String DJ) {
        this.DJ = DJ;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
