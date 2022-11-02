import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int num1;
        int num2;

        System.out.println("digite um numero");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("digite um segundo numero");
        num2 = scanner.nextInt();
        System.out.println("digite 1 para somar , digite 2 para subtrair, digite 3 para multipilcar , digite 4 para dividir ");

        int option = scanner.nextInt();

        switch (option) {
            case 1 -> System.out.println("o resultado da soma dos valores é: " + (num1 + num2));
            case 2 -> System.out.println("o resultado da subtracao dos valores é: " + (num1 - num2));
            case 3 -> System.out.println("o resultado da multiplicacao dos valores é: " + (num1 * num2));
            case 4 -> System.out.println("o resultado da divisao dos valores é: " + (num1 / num2));
        }

    }
}
