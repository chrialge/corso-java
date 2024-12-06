import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("quale il tuo nome? ");
        String nome = scanner.nextLine();

        System.out.println("quale il tuo cognome? ");
        String cognome = scanner.nextLine();

        System.out.println("Quale la tua eta?");
        int eta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quale la tua citta?");
        String citta = scanner.nextLine();

        System.out.println("Ciao " + nome + " " + cognome);
        System.out.println("Hai " + eta + " anni");
        System.out.println("Vivi a " + citta);

    }
}
