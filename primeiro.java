import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        // Calcula a média das duas notas
        double media = (nota1 + nota2) / 2;

        System.out.println("A média das notas " + nota1 + " e " + nota2 + " é: " + media);

        scanner.close();
    }
}
