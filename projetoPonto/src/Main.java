import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        Colaboradores colaborador1 = new Colaboradores();

        System.out.printf("""
                SISTEMA DE HORARIOS SMART CONECTA ltda
                
                se você já é um funcionario cadastrado no sistema de Horarios, digite 1
                caso você é da grencia e deseja cadastrar um novo usuario, digite 2
                """);
        escolha = scan.nextInt();
        while (escolha != 1 || escolha != 2){
        //if(colocar uma validação se a variavel ESCOLHA é do tipo INT)
            if(escolha == 1){
        colaborador1.registro();
        break;
        } else if (escolha == 2){
            colaborador1.criarSenha();
            break;
        } else {
            System.out.println("Sua escolha não foi coerrente com as alternativas," +
                    "\ntente novamente!");
        }
        }
    }
}
