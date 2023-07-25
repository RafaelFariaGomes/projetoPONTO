import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String escolha;
        Colaboradores colaborador1 = new Colaboradores();

        while (true){
            System.out.printf("""
                \nSISTEMA DE HORARIOS SMART CONECTA ltda
                
                se você já é um funcionario cadastrado no sistema de Horarios, digite 1
                caso você é da grencia e deseja cadastrar um novo usuario, digite 2
                para sair, digite 0
                """);
            escolha = scan.nextLine();
        if(escolha.equals("1")){
        colaborador1.registro();
        //break;
        }else if (escolha.equals("2")){
            colaborador1.criarSenha();
            //break;
        }else if (escolha.equals("0")){
                break;
            } else {
            System.out.printf("""
                    Resposta incompativel com as alternativas
                    Tente novamente!
                    """);
        }
        }
    }
}
