import java.util.Scanner;

public class Colaboradores {
Scanner scan = new Scanner(System.in);
    private String nome;
    private int chegada, saidaAlmoco, voltaAlmoco, fimExpediente;

    void registro(){
        System.out.println("Digite seu nome:");
        nome = scan.nextLine();
        nome.getChegada(2088);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getChegada() {
        return chegada;
    }
    public void setChegada(int chegada) {
        this.chegada = chegada;
    }
    public int getSaidaAlmoco() {
        return saidaAlmoco;
    }
    public void setSaidaAlmoco(int saidaAlmoco) {
        this.saidaAlmoco = saidaAlmoco;
    }
    public int getVoltaAlmoco() {
        return voltaAlmoco;
    }
    public void setVoltaAlmoco(int voltaAlmoco) {
        this.voltaAlmoco = voltaAlmoco;
    }
    public int getFimExpediente() {
        return fimExpediente;
    }
    public void setFimExpediente(int fimExpediente) {
        this.fimExpediente = fimExpediente;
    }
}
