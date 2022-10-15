import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Escreva um número:");//Escreva um número:
        int num = scan.nextInt();//Ler o Número
        System.out.println("O número Digitado é "+(num));//O número Digitado é 
        System.out.println("O número Antecessor é "+(num-1));// O número Antecessor é 
        System.out.println("O número Sucessor é "+(num+1));//O número Sucessor é 
    }
}
