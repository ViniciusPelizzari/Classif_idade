import java.util.Scanner;

public class classidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int input = scanner.nextInt();

        if (input >= 18) {
            System.out.println("Você está liberado para todos os tipos de conteúdos.");
        } else if (input >= 15 && input <= 17) {
            System.out.println("Você está liberado para conteúdos livres e programas até as 22:00 horas.");
        } else if (input >= 13 && input <= 14) {
            System.out.println("Você está liberado para conteúdos livres e programas até as 20:00 horas.");
        } else if (input >= 6 && input <= 12) {
            System.out.println("Você está liberado para conteúdos livres e infantis.");
        } else {
            System.out.println("Você está liberado para conteúdos livres com supervisão.");
        }
    }
}