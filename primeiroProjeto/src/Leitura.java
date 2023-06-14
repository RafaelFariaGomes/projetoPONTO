import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine(); // é como um ReadLine

        System.out.println("Digite o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();// é como um ReadLine, mas apenas para o INT

        System.out.println("Digite sua Avaliação deste filme");
        double avaliacao = leitura.nextDouble(); // é como um ReadLine para Double

        System.out.println("Seu filme favorito é: " + filme);
        System.out.println("Lançamento: " + anoDeLancamento);
        System.out.println(avaliacao);
    }
}
