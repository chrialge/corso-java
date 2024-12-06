# Perche imparare java

-   top 3 linguaggi piu popolari.
-   usato a livello aziendale (framework spring), giochi (Minecraft), web app e android.

Come funziona:

-   computer usano codice macchina (basso livello) binario 00000001 00000010 00000011 00000100.
-   noi scriviamo `source code` (alto livello) in file `.java`.
-   java viene poi compilato ovvero tradotto in codeice macchina.
-   quando pero compiliamo il codice e specifico per il sistema operativo (Mac, Windows ecc...).
-   java mette a disposizione uno step intermedio
    source code --> compiler --> byte code --> jvm --> machine code

JVM: java virtual machine e contenuto nel JDK.
JDK: java development kit che contiene JRE.
JRE: java runtime environment contiene librerie toolkits

JDK --> JRE --> JVM

Ci serve un IDE
IDE: integrate development environment(ambiente di sviluppo)

-   eclipse, vsc e intellij

es. Main.java

```java

public class Main {

    public static void main(String[] args) {

        // stampa ciao e poi va capo perche println prende tutta la riga
        System.out.println("ciao");

        // stampa ciao
        System.out.print("ciao");

    }
}


```

## Java variabili

che cos'e una variabile?

-   una variabile e uno spazio dedicato dove verra contenuto un tipo di dato, esso puo essere modificato o riassegnato con un nuovo valore.

quindi una variabile puo essere: dichirata, assegnata e iniziallizata

```java

public class Main {

    public static void main(String[] args) {

        int x; // dichiaraziobe di una variabile
        x = 45; // assegnazione della variabile

        int y = 34; // inizializzazione di una variabile


    }
}


```

Il nome della variabile e importante dal punto vista di lettura del codice, debbuging e collaborazione con altre persone, e anche da un punto di vista organizzativo.
In Java esistono diversi tipi di dato che a sua volta sono raggruppati in dati primiti e dati reference

Dati Primitivi:

-   boolean | true : false | 1bit
-   byte | -128 : 127 | 1byte
-   short | -32768 : 32767 | 2bytes
-   int | -2miliardi : 2 miliardi | 4bytes
-   long | -9quintilioni : 9 quintilioni | 8bytes --> per il long alla fine del numero mettere una `l` o in maiuscola `L`

-   float | numero con 6-7 cifre decimali 5.123456f | 4bytes --> per il float alla fine del numero mettere una `f`
-   double | numero con 15 cifre decimali 5.12345678901234 | 8bytes

-   char | singolo carattere/lettera/ASCII 'f' | 2bytes
-   String | sequenza di caratteri "ciao Java" | variabile

Quindi quando dichiari una variabile devi tipizzare il tipo di dato che verra conservato e modificato

```java

public class Main {

    public static void main(String[] args) {

        boolean ilBoolean = true;
        byte ilBite = -128;
        short ilShort = -32768;
        int ilInt = 2_000_000_000;
        long ilLong = 3_000_000_000_000L;

        float ilFloat = 3.45678f;
        double ilDouble = 2.12345678901234

        char ilChar = 'f';
        String laStringa = "ciao Java";
    }
}


```

Nota: i singoli apici per il char mentre i doppi apici sono per le stringhe

I dati primitivi lo si riconosce che la tipizazzione inizia con la lettera maiuscola mentre le reference no, poi i dati primitivi vengono dati da java mentre le reference dovremmo crearle, le reference hanno attributi e metodi che le primitive non hanno

## Java - user input

```Java

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

```

si deve prima importare lo scanner importandolo nel file, e raccomandato di scrivere le importazioni all'inizio del file, poi abbiamo creato lo scanner che prendera le rsposte dello user.
