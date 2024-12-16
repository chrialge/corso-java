public class es15 {

    public static void main(String[] args) {

        int[] numeri = new int[3];

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;

        System.out.println(numeri[1]);

        numeri[1] = 100;

        System.out.println(numeri[1]);

        int[] numbers = { 10, 20, 30, 40 };

        System.out.println(numbers[1]);

        for (int numero : numbers) {
            System.out.println(numero);
        }

    }
}