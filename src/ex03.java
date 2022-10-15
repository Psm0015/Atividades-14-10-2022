import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");// Qual o seu nome: 
        String nome = scan.nextLine();// Leitura do nome

        System.out.println("Olá "+nome+", Seja bem-vindo!");//Olá Pedro, Seja bem-vindo!
    }
}
