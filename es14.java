public class es14 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 4) {
                continue;
            } else if (i == 6) {
                break;
            }

            System.out.println("riga " + i);

            for (int j = 0; j < 5; j++) {
                System.out.println("colonna " + j);
            }
        }

        int[] numeri = { 10, 20, 30, 40, 50 };

        for (int numero : numeri) {
            System.out.println(numero);
        }
    }
}
