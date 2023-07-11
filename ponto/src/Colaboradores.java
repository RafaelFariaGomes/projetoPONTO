import java.util.Scanner;
import java.time.LocalTime;
public class Colaboradores {
Scanner scan = new Scanner(System.in);
    private String nome;
    private  chegada, saidaAlmoco, voltaAlmoco, fimExpediente;

    void registro(){
        System.out.println("Digite seu nome:");
        nome = scan.nextLine();
        System.out.println("Olá " + nome + " digite o horario de entrada.");
        chegada = scan.nextInt();
        System.out.println(nome + " seu horario de chagada foi as: " + chegada + " mesmo?");


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
