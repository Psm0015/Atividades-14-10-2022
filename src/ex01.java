import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) throws Exception {
        Scanner Scan = new Scanner(System.in);//Criando o Scanner
        
        System.out.println("Digite a Primeira nota: ");//Digite a Primeira nota: 
        float n1 = Scan.nextFloat();//Leitura do Primeiro Numero
        System.out.println("Digite a Segunda nota: ");
        float n2 = Scan.nextFloat();//Leitura do Primeiro Segundo
        float media = (n1 + n2)/2; //Calculo de Média
        System.out.println("Sua nota foi "+media+".");//Sua nota foi nota
        if (media>=7){//Se a nota for maior ou igual a 7
            System.out.println("Parabéns você foi aprovado");//Parabéns você foi aprovado
        } else { //Senão
            System.out.println("Infelizmente Você foi reprovado");//Infelizmente Você foi reprovado
        }
    }
}