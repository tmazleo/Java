import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        int selec;
        do{
            System.out.println("Menu");
            System.out.println("Opções: ");
            System.out.println("Opção 1 - xtudo[1]");
            System.out.println("Opção 2 - bauru[2]");
            System.out.println("Opção 3 - sair[3]");

            Scanner menu = new Scanner(System.in);
            System.out.print("selecione uma opção:");
            selec = menu.nextInt();
            
            switch (selec) {
                case 1: System.out.println("xtudooo!");
                break;
                case 2: System.out.println("hmmm, bauru!");
                break;
                case 3: System.out.println("fica pra próxima! :)");
                break;
                default: System.out.print("não existe isso");
                break;
            }
        }while(selec != 3);
        

        
        
    }
}