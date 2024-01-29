import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String primeiroNome;
        String sobreNome;
        Scanner input = new Scanner(System.in);
        System.out.println("Exemplo dde Hello Word ");

        System.out.print("Digite seu pimeiro nome: ");
        primeiroNome = input.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        sobreNome = input.nextLine();
        System.out.println();
        System.out.println("Olá "+primeiroNome+" "+sobreNome+"!!");
        System.out.println("Seja Bem Vindo ao Sistema.");
        input.close();
    }
}