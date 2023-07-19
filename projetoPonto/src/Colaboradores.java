import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Colaboradores {
    Scanner scan = new Scanner(System.in);
    private String nome;
    private String chegada, saidaAlmoco, voltaAlmoco, fimExpediente;
    private String horaAtual;
    private String cargo;

    void registro() {
        System.out.println("\nDigite seu nome completo:");
        nome = scan.nextLine();
        LocalDateTime horaAtual = LocalDateTime.now();

        System.out.println("Digite seu cargo:");
        cargo = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String chegada = horaAtual.format(formatter);

        System.out.println("seu ponto foi batido as: " + chegada);
    }
    void criarSenha() {
        // este metodo a baixo pega a senha do usuario,
        // pega a confirmação da senha do usuario
        // e por ultimo ve se as duas variaveis de senha e confirmação são iguais
        // caso forem iguais, inclue a senha na variavel final (senhaColaborador) essa sim, será utilizada como a senha real
        String senha = "";
        String confirmacao = ".";
        String senhaColaborador;

        while(senha.equals(confirmacao) == false){
            System.out.println("digite sua senha:") ;
            senha = scan.nextLine();
            System.out.println("confirme sua senha:") ;
            confirmacao = scan.nextLine();

            if(senha.equals(confirmacao)){
                senhaColaborador = senha;
                System.out.printf("sua senha: " + senhaColaborador);
                break;
            }
            System.out.println("Algum caracter não condiz com a senha, digite novamente");
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getChegada() {
        return chegada;
    }
    public void setChegada(String chegada) {
        this.chegada = chegada;
    }
    public String getSaidaAlmoco() {
        return saidaAlmoco;
    }
    public void setSaidaAlmoco(String saidaAlmoco) {
        this.saidaAlmoco = saidaAlmoco;
    }
    public String getVoltaAlmoco() {
        return voltaAlmoco;
    }
    public void setVoltaAlmoco(String voltaAlmoco) {
        this.voltaAlmoco = voltaAlmoco;
    }
    public String getFimExpediente() {
        return fimExpediente;
    }
    public void setFimExpediente(String fimExpediente) {
        this.fimExpediente = fimExpediente;
    }
    public String getHoraAtual() {
        return horaAtual;
    }
    public void setHoraAtual(String horaAtual) {
        this.horaAtual = horaAtual;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        cargo = cargo;
    }
}
