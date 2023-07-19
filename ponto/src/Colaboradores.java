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
}