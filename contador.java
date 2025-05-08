import java.util.Scanner;

public class contador{
    public static void main(String[] args) {

    int numeros = -1;
    int soma = 0;
    int contador = 0;

    Scanner scanner = new Scanner(System.in);
        while (numeros != 0) {
            
            System.out.println("digite um número: ");
                numeros = scanner.nextInt();

            if (numeros != 0) {
                soma += numeros;
                contador++;
            }
        }
        System.out.println("soma dos números: " + soma);
        System.out.println("números digitados: " + contador);
        System.out.println();
        System.out.println("fim do programa");

    scanner.close();
    }
}