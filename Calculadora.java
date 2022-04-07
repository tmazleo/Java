import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args){

        System.out.println("Calculadora Simples!");
        int opcao;
        do{
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("Oque deseja? (0 para sair): ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
        } while(opcao != 0);
        

    }
    public static void processar(int opcao){
        Scanner scanner = new Scanner(System.in);
        switch(opcao){
            case 1: {
                System.out.println("Somando!");
                System.out.print("digite o numero: ");
                int numero1 = scanner.nextInt(); 
                System.out.print("digite o numero: ");
                int numero2 = scanner.nextInt();
                int soma = numero1 + numero2;
                System.out.println("A soma é: " + soma);
            }
            break;
            case 2: {
                System.out.println("Subtraindo!");
                System.out.print("digite o numero: ");
                int numero1 = scanner.nextInt(); 
                System.out.print("digite o numero: ");
                int numero2 = scanner.nextInt();
                int subtracao = numero1 - numero2;
                System.out.println("A subtração é: " + subtracao);
            }
            break;
            case 3: {
                System.out.println("multiplicando!");
                System.out.print("digite o numero: ");
                int numero1 = scanner.nextInt(); 
                System.out.print("digite o numero: ");
                int numero2 = scanner.nextInt();
                int multp = numero1 * numero2;
                System.out.println("A multiplicação é: " + multp);
            }
            break;
            case 4: {
                System.out.println("dividindo!");
                System.out.print("digite o numero: ");
                double numero1 = scanner.nextInt(); 

                System.out.print("digite o numero: ");
                double numero2 = scanner.nextInt();
                if((numero1 == 0) || (numero2 == 0)){
                    System.out.print("não é possivel realizar esta divisão");
                }

                double dividir = numero1 / numero2;
                System.out.println("A divisão é: " + dividir);
            }
            break;
            
    
        }    
    }
    
}
