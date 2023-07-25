import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        Colaboradores colaborador1 = new Colaboradores();

        while (true){
            System.out.printf("""
                \nSISTEMA DE HORARIOS SMART CONECTA ltda
                
                se você já é um funcionario cadastrado no sistema de Horarios, digite 1
                caso você é da grencia e deseja cadastrar um novo usuario, digite 2
                para sair, digite 0
                """);
            escolha = scan.nextInt();
        if(escolha == 1){
        colaborador1.registro();
        //break;
        } else if (escolha == 2){
            colaborador1.criarSenha();
            //break;
        } else if (escolha == 0){
                break;
            }
        }
    }
}
