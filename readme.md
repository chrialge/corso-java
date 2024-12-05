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
