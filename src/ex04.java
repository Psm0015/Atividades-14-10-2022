import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Construção do Scanner

        System.out.println("Nome do Funcionário: ");//Nome do Funcionário: 
        String nome = scan.nextLine();//Leitura do Nome do funcionário

        System.out.println("Quantas horas o "+nome+" Trabalhou? ");//Quantas horas o Pedro Trabalhou? 
        int horas = scan.nextInt();//Leitura de Horas Trabalhadas

        System.out.println("Valor da hora de "+nome+": ");//Valor da hora de Pedro: 
        float valorHora = scan.nextFloat();// Leitura de Valor de Hora

        float Salário = horas*valorHora;//Calculo do Salário

        //Resultado Final
        Locale localeBR = new Locale("pt","BR");//pega o Locale BR
        NumberFormat formaDinheiro = NumberFormat.getCurrencyInstance(localeBR);// Formata numeros para dinheiro    formaDinheiro.format()
        System.out.println("-=-=-=-=-= RENDA MENSAL =-=-=-=-=-");
        System.out.println("Nome : "+nome);
        System.out.println("Renda por hora: "+(formaDinheiro.format(valorHora)));//Imprime Renda por Hora
        System.out.println("Renda por mês: "+(formaDinheiro.format(Salário)));//Imprime Renda por Mês
        System.out.println("Renda por Ano: "+(formaDinheiro.format(Salário*12)));//Imprime Renda por Ano
        
    }
}
