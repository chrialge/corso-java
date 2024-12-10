public class es11 {

    public static void main(String[] args) {

        boolean isOnline = true;

        if (isOnline) {
            System.out.println("l'utente e online");
        } else {
            System.out.println("l'utente non e online");
        }

        String nome = "Luca";

        if (nome == "Luca") {
            System.out.println("e " + nome);
        } else if (nome == "Marco") {
            System.out.println("e " + nome);
        } else {
            System.out.println("e qualcun'altro");
        }

        int numero = 3;

        if (numero < 10) {
            System.out.println("il numero e minore di 10");

            if (numero % 2 == 0) {
                System.out.println("il numero e pari");
            } else {
                System.out.println("il numero e dispari");
            }
        } else {
            System.out.println("il numero non e minore di 10");

        }

        String d = 3 < 10 ? "ciao" : "addio";

        System.out.println(d);

    }
}
