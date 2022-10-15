import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Constroi Scan

        System.out.println("Qual o valor do Jantar: R$");//Qual o valor do Jantar: R$
        float valor = scan.nextFloat();//Lê o valor

        float prcGar =(valor*10)/100;//Calcula porcentagem do Garçom
        float Total = (prcGar+valor);//Calcula Total da conta
        
        Locale localeBR = new Locale("pt","BR");//pega o Locale BR
        NumberFormat formaDinheiro = NumberFormat.getCurrencyInstance(localeBR);// Formata numeros para dinheiro    formaDinheiro.format()

        System.out.println("-=-=-=-=-=CONTA=-=-=-=-=-");
        System.out.println("Porcentagem do Garçom: "+formaDinheiro.format(prcGar));//Porcentagem do Garçom: R$ 10,00
        System.out.println("Valor da Refeição: "+formaDinheiro.format(valor));//Valor da Refeição: R$ 100,00
        System.out.println("Total: "+formaDinheiro.format(Total));//Total: R$ 110,00

    }
}
