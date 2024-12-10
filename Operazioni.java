public class Operazioni {

    public static void main(String[] args) {

        // operatori aritmetici
        int x = 10;
        int y = 2;
        int z = x + y;
        System.out.println(z);

        // shorthand
        int a = 5;
        a += 3;
        System.out.println(a);

        // incremento e decremeto
        int d = 4;
        d++;
        System.out.println(d);

        // espressioni aritmetiche
        int f = 11;
        int g = 3;
        int h = 9;
        int result = ((g + f) * g + (4 - 2)) * h;
        System.out.println(result);
    }
}
