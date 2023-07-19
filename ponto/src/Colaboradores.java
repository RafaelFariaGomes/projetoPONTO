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
}