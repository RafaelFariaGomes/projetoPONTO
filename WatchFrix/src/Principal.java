public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // declaração de um novo objeto na classe Filme
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracao(120);
        //meuFilme.somaAvaliacoes = 10; essa atribuição não pode ser mais usada pois o método se tornou privado

        Filme filme2 = new Filme();
        filme2.setNome("Avatar 2");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracao(200);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do Filme: " + meuFilme.getDuracao());
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        //System.out.println(meuFilme.somaAvaliacoes); não é mais possivel usar essa linha pois o metodo está privado
        //System.out.println(meuFilme.totalAvaliacoes); não é mais possivel acessar pois está privado
        // jeito certo de fazer o print do metodo privado abaixo:
        System.out.println("o Total de avaliações é: " + meuFilme.getTotalAvaliacoes());
        System.out.println("Média das Avaliações: " + meuFilme.mediaAvaliacoes());

        System.out.println("\nSerie: ");
        Serie BreakingBad = new Serie();
        BreakingBad.setNome("Breaking Bad");
        BreakingBad.setAnoDeLancamento(2008);
        BreakingBad.exibeFichaTecnica();
        BreakingBad.setMinutosPorEpisodio(50);
        BreakingBad.setTemporadas(5);
        BreakingBad.setEpisodiosPorTemporada(8);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(filme2);
        calculadora.inclui(meuFilme);
        System.out.println("Maratona: " + calculadora.getTempoTotal());

        System.out.println("Duração para maratonar Breaking Bad: " + BreakingBad.getDuracao());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodio1BreakingBad = new Episodios();
        episodio1BreakingBad.setNome("Mosca");
        episodio1BreakingBad.setNumero(1);
        episodio1BreakingBad.setSerie(BreakingBad);
        episodio1BreakingBad.setTotalVisualizacoes(3000);
        filtro.filtra(episodio1BreakingBad);
    }

}
