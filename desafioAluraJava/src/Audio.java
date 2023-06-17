public class Audio {
    private int minutos;
    private int segundos;
    private String nome;
    private int curtidas;
    private int reproducoes;
    private String genero;

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void setReproducoes(int reproducoes) {
        this.reproducoes = reproducoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void fichaTecnicaAudio(){
        System.out.println("Nome da musica: " + getNome());
        System.out.println("Total de curtidas: " + getCurtidas());
        System.out.println("total de reproduções: " + getReproducoes());
        System.out.println("tempo de reprodução: " + getMinutos() + ":" + getSegundos());
        System.out.println("Genero: " + getGenero());
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
