import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Construção do Scanner

        System.out.println("Valor da conta: ");//Valor da conta: 
        float valor = scan.nextFloat();//Lê o valor da conta
        System.out.println("A conta será dividida em quantas partes: ");//A conta será dividida em quantas partes: 
        int quant = scan.nextInt();//Le quantidade de pessoas

        float r = valor/quant;//Divide o valor

        Locale localeBR = new Locale("pt","BR");//pega o Locale BR
        NumberFormat formaDinheiro = NumberFormat.getCurrencyInstance(localeBR);// Formata numeros para dinheiro    formaDinheiro.format()
        System.out.println("O valor foi dividido para "+quant+" pessoas"); // O valor foi dividido para quantidade pessoas
        System.out.println("O valor individual para cada ficou: "+formaDinheiro.format(r));//O valor individual para cada ficou: R$Valor em reais
    }
}
