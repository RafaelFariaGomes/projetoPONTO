public class FiltroRecomendacao {
    public void filtra(Classificacao classificacao){
        if(classificacao.getClassificacao() >= 4){
            System.out.println("Este titulo está entre os preferidos do momento!");
        } else if(classificacao.getClassificacao() >= 2) {
            System.out.println("Este titulo é muito bem avaliado!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
