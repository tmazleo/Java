

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args){
        System.out.println("--Programa de Endereços--");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Insira sua rua: ");
        String rua = entrada.nextLine();

        System.out.print("Numero: ");
        String nu = entrada.nextLine();
        
        System.out.print("Bairro: ");
        String bairro = entrada.nextLine();
        
        System.out.print("Cidade: ");
        String ci = entrada.nextLine();
        
        System.out.print("Estado: ");
        String es = entrada.nextLine();
        
        System.out.print("Cep: ");
        String cep = entrada.nextLine();

        
        
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + rua + ", " + nu + " - " + bairro + "," + ci + "," + es + " - CEP: " + cep);
        
    }
}
