import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Colaboradores {
    Scanner scan = new Scanner(System.in);
    private String nome;
    private String chegada, saidaAlmoco, voltaAlmoco, fimExpediente;
    private String horaAtual;
    private String Cargo;

    void registro() {
        System.out.println("Digite seu nome:");
        nome = scan.nextLine();
        LocalDateTime horaAtual = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String chegada = horaAtual.format(formatter);

        System.out.println("seu ponto foi batido as: " + chegada);
    }
    //pegar a senha do usuario, pegar a confirmação de senha do usuario e ver se é igual as duas, caso for igual, jogar a senha na variavel final (senhaColaborador)
    void criarSenha() {
        String senha;
        String confirmacao;
        String senhaColaborador;

        System.out.print("digite sua senha") ;
        senha = scan.nextLine();

        System.out.print("confirme sua senha: ") ;
        confirmacao = scan.nextLine();

        if(senha == confirmacao){
            senhaColaborador = senha;
        } else {
            System.out.println("Algum caracter não condiz com a senha, digite novamente");
        }
    }
}