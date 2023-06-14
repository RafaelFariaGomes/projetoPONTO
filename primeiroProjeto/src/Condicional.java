public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean inclusoNoPlano = true; // o filme está incluso no plano desta classe
        double notaFilme = 8.1;
        String tipoPlano = "normal";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão gostando!");

        } else {
            System.out.println("Filme Retro, que vale a pena assistir!");

        }
        if(inclusoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado!");

        } else {
            System.out.println("Deve pagar a liberação");
        }
    }
}
