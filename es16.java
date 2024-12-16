public class es16 {

    public static void main(String[] args) {

        String[][] classi = {
                { "Marcin", "Christian", "Enrico", "Francesco", "Riccardo" },
                { "Paolo", "Marco", "Lorenzo", "Martina", "Georgia" },
                { "Ylenia", "Sofia", "Leonardo", "Patrizio", "Debora" }
        };

        for (String[] classe : classi) {
            System.out.println();
            for (String alunno : classe) {
                System.out.print(alunno + " ");
            }
        }

    }
}
