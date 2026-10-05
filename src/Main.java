//Classe principal da aplicação
//Responsável apenas por iniciar o programa, delegando o fluxo de interação com o usuário para a classe Menu
public class Main {
    
    public static void main(String[] args) {

        //Cria o menu principal do sistema
        Menu menu = new Menu();

        //Inicia a execução do menu, exibindo as opções ao usuário
        menu.executar();

    }
}
