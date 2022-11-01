import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int a,b,VariavelTemporaria;

        System.out.println("----------Troca de Variaveis----------");

        System.out.println("Digite a variavel a:");
        a = entrada.nextInt();

        System.out.println("Digite a variavel b:");
        b = entrada.nextInt();

        VariavelTemporaria = a;
        a = b;
        b = VariavelTemporaria;

        System.out.println("a = "+a+" | b = "+b+"\n");
    }
}