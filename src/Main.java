import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Id do cliente: ");
        int id_cliente = scanner.nextInt();
        System.out.print("Aumento do limite: ");
        int a_limite = scanner.nextInt();
        System.out.print("Confirmar operação (true/false)? ");
        boolean confirmacao = scanner.nextBoolean();
    }
}
