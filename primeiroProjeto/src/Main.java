
public class Main {
    public static void main(String[] args) {
        System.out.printf("Esse é o WatchFrix!");
        System.out.println("Filme: Top Gun: Marverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean inclusoNoPlano = true; // o filme está incluso no plano desta classe
        double notaFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        //média calculada por 3 notas dadas pelos profs do curso da Alura
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de Aventura com sla quem dos anos 80
                Avaliação alta
                Ano de Lançamento: 2022
                """;
        System.out.println("Média do filme: " + media);
        //classes em java recebem a 1° letra maiuscula
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        //isso acima é um casting, uma conversão de variaveis, eu converti uma variavel do tipo double
        // para o tipo INT / existe uma tabela de casting, caso precise usar
        System.out.println(classificacao);



        }
    }
