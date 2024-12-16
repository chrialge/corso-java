import java.util.ArrayList;

public class es19 {

    public static void main(String[] args) {

        ArrayList<String> persone = new ArrayList<String>();

        persone.add("Luca");
        persone.add("Andrea");
        persone.add("Martina");
        persone.add("Marcin");
        persone.add("Sofia");
        persone.add("Nicolo");

        persone.set(2, "Paola");
        persone.remove(0);
        persone.clear();

        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));

        }

        ArrayList<ArrayList<String>> classi = new ArrayList();

        ArrayList<String> classe1 = new ArrayList<String>();

        classe1.add("Christian");
        classe1.add("Stefano");
        classe1.add("Francesca");
        classe1.add("Regina");
        classe1.add("Paolo");

        ArrayList<String> classe2 = new ArrayList<String>();

        classe2.add("Alice");
        classe2.add("Federica");
        classe2.add("Lorenzo");
        classe2.add("Alessandro");
        classe2.add("Pisa");

        classi.add(classe1);
        classi.add(classe2);

        for (int i = 0; i < classi.size(); i++) {
            System.out.println();
            for (int y = 0; y < classi.get(i).size(); y++) {
                System.out.print(classi.get(i).get(y) + " ");

            }

        }

    }
}