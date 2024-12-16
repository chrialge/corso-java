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

## Java - operatori aritmetici

operatori aritmetici:

-   `+` --> operatore di somma e di concatenazione;
-   `-` --> operatore di sottrazione;
-   `/` --> operatore di divisione;
-   `*` --> operatore di moltiplicazione;
-   `%` --> operatore che mi da il resto di una divisione;

shorthand:

-   `+=` --> sommo se stesso con un'altro numero;
-   `-=` --> sotraggo se stesso con un'altro numero;
-   `/=` --> divideo se stesso con ul'atro numero;
-   `*=` --> moltiplica se stesso con un'atro numero;
-   `%=` --> da ilresto della divisione tra se stesso con l'atro numero;

incremento e decremento:

-   `++` --> incremento di uno;
-   `--` --> decremento di uno;

mentre per le espressioni aritmetiche come a scuola se vuoi che una operazione vanga prima dell'atra basta racchiuderla in delle parentesi tonde `()` e puoi inglobare con un'atra parentesi ma sempre tonda.

## Java - Math class

-   `Math.abs()` --> riporta il numero in uno positivo;
-   `Math.min()` --> riporta il numero piu piccolo tra quelli messi nella parentesi;
-   `Math.max()` --> riporta il numero piu grande tra quelli messi nella parentesi;
-   `Math.pow()` --> il primo numero messo nelle parentesi e quello che vuoi elevare metre il secondo la potenza, e riportera il numero elevato alla potenza che abbiamo scelto;
-   `Math.sqrt()` --> il primo numero messo nelle parentesi e quello per cui vuoi fare la radice quadrata e il secondo e la potenza, e riporta la radice quadrata del numero;
-   `Math.PI` --> riporta il pi greco;

## Java - operatori di comparazione

-   `>` --> il numero di sinistra e maggiore di quello di destra;
-   `<` --> il numero di sinistra e minore di quello di destra;
-   `>=` --> il numero di sinistra e uguale/maggiore di quello di destra;
-   `<=` --> il numero di sinistra e uguale/minore di quello di destra;
-   `==` --> il valore di sinistra e uguale a quello di destra;
-   `!=` --> il valore di sinistra e diverso da quello di destra

## Java - operatori logici

-   `AND`/ `&&` --> operatore per cui si devono verificare tutte le condizioni;
-   `OR`/ `||` --> operatore per cui almeno una delle condizioni deve verificarsi;
-   `NOT`/ `!` --> operatore per cui non deve verificare la condizione;

## Java - if/else if/else

quando si ha bisogno che un blocco di istruzioni vengano eseguite in determinate condizioni, si utilizzo l' `if`.

```java

public class Main {

    public static void main(String[] args) {

        boolean isOnline = true;

        if(isOnline){
            System.out.printl("e online");
        }

    }
}


```

Come si vede nel blocco di codice qui sopra se `isOnline` e true svolge il blocco di codice e poi va avanti, se non si verifica la condizione viene saltato e va avanti, ma in caso ci vorremmo mettere la cassistica che se non si verifica la condizione ci sia una di default basta aggiungere l' `else`

```java

public class Main {

    public static void main(String[] args) {

        boolean isOnline = true;

        if(isOnline){
            System.out.printl("e online");
        }else{
            System.out.printl("non e online");

        }

    }
}


```

Nel caso vorremmo piu condizioni basta aggiungere un `else if`. Ed e possibile anche anidare all'interno di un `if` un altro `if`.

```java

public class Main {

    public static void main(String[] args) {

        int x = 4;

        if(x< 10){

            System.out.printl("il numero e minore di 10");


            if(x % 2 == 0){
                System.out.printl("il numero e pari");

            }else{
                System.out.printl("il numero e dispari");

            }

        }else if(x < 50){

            System.out.printl("il numero e tra 10 e 50");

        }else{
            System.out.printl("il numero e troppo grande");

        }
    }
}


```

## Java - switch

Come per l' `if` switch svolge un blocco di istruzioni in caso si verifica tale condizione, ma rispetto all'altro lo `switch` non puo avere condizioni troppo complicate cioe l'espressioni.

```java

public class Main {

    public static void main(String[] args) {

        String nome = "Luca";

        switch (nome) {
            case "Luca":
                System.out.println("ciao LuCA");
                break;
            default:
                break;
        }
    }
}


```

## Java - ciclo while/do while

in caso vorremo iterare per un determinate volte ci usano i cicli, per la costruzione di un ciclo serve un `contattore`, `condizione`, `incremento o decvremento` del `contatore`.

```java

public class Main {

    public static void main(String[] args) {

        // contatore
        int i = 0;

        // condizione
        while (i < 5) {

            System.out.println(i);

            // incremento
            i++;
        }

    }
}


```

Come si puo vedere il blocco di istruzioni si svolgera fin tanto che la condizione e vera in caso la condizione non si verifica interompe il ciclo e va avanti. Mentre per il `do while` prima si svolge il blocco d'istruzione e poi controlla la condizione.

```java

public class Main {

    public static void main(String[] args) {

        int c = 0;

        do {
            System.out.println(c);
            c++;
        } while (c < 0);
    }
}

```

Come si puo vedere dal codice sopra esegue il blocco di istruzione e poi controlla, in questo caso il blocco di struzione viene eseguito solo una volta ma se avessimo usato il while non avrebbe svolto neanche una volta

## Java - ciclo for

il ciclo for rispetto al while e do while il `contatore`, `condizione` e `incremento/decremento` si dichiara nella parentesi del `for`. Esso puo avere all'interno un ulteriore ciclo `for`.

```java

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("riga " + i);

            for (int j = 0; j < 5; j++) {
                System.out.println("colonna " + j);
            }
        }


    }
}


```

In caso vuoi interrompere quando avviene una determinata condizione il ciclo si usa `break` mentre se vuoi che salta quel ciclo si usa `continue`.

```Java

public class Main {

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

    }
}


```

mentre per l'array si usa il ciclo for `enchaned` che in altri linguaggi di programmazione viene chiamato `foreach`.

```Java
public class Main {

    public static void main(String[] args) {

        int[] numeri = { 10, 20, 30, 40, 50 };

        for (int numero : numeri) {
            System.out.println(numero);
        }
    }
}


```

## Java - Array

Gli array potremo definire come una collezione di dati, e questi dati tra di loro sono correlati. Gli array di java rispetto agl'altri linguaggi di programmazione ha una dimensione fissa.

```Java

public class Main {

    public static void main(String[] args) {

        int[] numeri = new int[3];

        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;


    }
}

```

In questo caso abbiamo prima inizializzato l'array dicendo che ha una lunghezza di tre(Nota bene: anche per gli array devi dichiarare il tipo di dato che ci sara), e poi gli abbiamo assegnato il valore richiamando l'array con l'indice come si puo vedere l'indice inizia da 0 ed essendo una array di lunghezza 3 il suo ultimo indice 2. questi valore possono essere cambiati ma non si puo superare la aumentare la lunghezza delll'array dopo averlo inzializzato.

```Java

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

    }
}

```

Essi potranno essere iterati per visualizzare il singolo elemento senza ogni volta dichiarare l'indice.

```Java

public class Main {

    public static void main(String[] args) {

        int[] numeri = { 10, 20, 30, 40, 50 };

        for (int numero : numeri) {
            System.out.println(numero);
        }
    }
}

```

## Java - Array 2D

Rispetto agl'array normali questi array a sua volta all'interno avra all'interno altri array.

```Java

public class Main {

    public static void main(String[] args) {

        String[][] classi = new String[3][5];

        classi[0][0] = "Marcin";
        classi[0][1] = "Christian";
        classi[0][2] = "Enrico";
        classi[0][3] = "Francesco";
        classi[0][4] = "Riccardo";

        classi[1][0] = "Paolo";
        classi[1][1] = "Marco";
        classi[1][2] = "Lorenzo";
        classi[1][3] = "Martina";
        classi[1][4] = "Georgia";

        classi[2][0] = "Ylenia";
        classi[2][1] = "Sofia";
        classi[2][2] = "Leonardo";
        classi[2][3] = "Patrizio";
        classi[2][4] = "Debora";

        for (int classe = 0; classe < classi.length; classe++) {
            System.out.println();

            for (String alunno : classi[classe]) {
                System.out.print(alunno + " ");
            }
        }

    }
}

```

Mentre se vuoi inizializzare un array con gia dentro i dati si fa come qua sotto

```Java

public class Main {

    public static void main(String[] args) {

        String[][] classi = {
                { "Marcin", "Christian", "Enrico", "Francesco", "Riccardo" },
                { "Paolo", "Marco", "Lorenzo", "Martina", "Georgia" },
                { "Ylenia", "Sofia", "Leonardo", "Patrizio", "Debora" }
        };

        for (String[] classe: classi) {
            System.out.println();
            for (String alunno : classe) {
                System.out.print(alunno + " ");
            }
        }

    }
}

```

## Java - metodi stringhe

-   `stringa.equals("")` --> metodo che compara la stringa con quello dentro le parentesi e rida un valore boleano(ricordati: e case sensitive);
-   `stringa.equalsIgnoreCase()` --> metodo che compara la stringa con quello dentro le parentesi e rida un valore boleano ignorando se e maiuscolo o minuscolo;
-   `stringa.length` --> metodo che rida la lunghezza della stringa;
-   `stringa.charAt()` --> metodo che rida il carattere alla posizione che mettiamo dentro le parentesi (ricordati: inizia da 0);
-   `stringa.indexOf()` --> metodo che ritorna l'indice del parametro che si trova dentro la stinga;
-   `stringa.isEmpty()` --> metodo che controlla se e vuota la stringa ed ritorna un valore booleano;
-   `stringa.toUpperCase()` --> metodo che ritorna la stringa ma tutto in maiuscolo;
-   `stringa.toLowerCase()` --> metodo che ritorna la stringa in minuscolo;
-   `stringa.trim()` --> metodo che toglie gli spazi all'inizio e alla fine;
-   `stringa.replace(parametro1, parametro2)` --> metodo che con il primo prametro indica quale porzione della stringa deve essere sostituita con il secondo parametro;

## Java - Wrapper Class

le `wrapper class` permettono di utilizzare dati primitivi come reference, cio si puo utilizzare i metodi ai dati primitivi ma verrano lo stesso trattate allo stesso modo di prima, cioe sono piu lente rispetto ai dati primitivi normali.

```Java

public class Main {

    public static void main(String[] args) {
        Boolean vero = true;
        boolean falso = false;

        Character carattere1 = 'a';
        Character carattere2 = 'b';

        Integer numero1 = 15;
        int numero = 10;

        Double decimale1 = 3.24;
        double decimale2 = 7.24;

    }
}


```

## Java - Arraylist

Le `ArrayList` sono array ridimensionabili cioe possono avere lunghezza variabile, ma in compenso accetano solo reference. Ricordati di che esso deve essere importanto nel file `import java.util.ArrayList;`.

Per creare un ArrayList si dicara poi nelle parentesi angolari si mette il tipo di reference si accetta poi si chiam la classe facendo `new ArrayList<reference>()`

```java

import java.util.ArrayList;

public class Main {

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

    }
}

```

come si vede sopra l'arraylist a i suoi metodi tipo:

-   `.add()` -> questo metodo ti permette di aggiungere record all'interno dell'array, il valore si imette dentro le parentesi;
-   `.remove()` -> questo metodo ti permette di togliere record all'interno dell'array, l'indice si imette dentro le parentesi;
-   `.get()` -> questo metodo ti permette di prendere il record dell'array, l'indice si imette dentro le parentesi;
-   `.clear()` -> questo metodo ti permette di svuoatare l'array;

Queste arraylist a sua volta possono essere racchiuse all'interno da sua volta da un arraylist dichiarandolo nelle parentesi angolari e asua volta dovra dichiare il tipo di arraylist che si crea.

```java

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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

```

## Java -Metodi

I Metodo o funzioni sono blocchi di codice che vogliamo richiamare ogni qualvolta che ci serve.

```Java

public class Main {

    public static void main(String[] args) {

        addizione();
    }

    static void addizione() {
        int risultato = 3 + 3;
        System.err.println(risultato);
    }
}
```

In caso vorremmo passare dei dati al nostro metodo basta che si dichiari nelle parentesi il tipo e il nome di essso, e qundo invoco la funzione basta che li passo dentro le parentesi.

```Java

public class Main {

    public static void main(String[] args) {

        addizione(4, 6);
    }

    static void addizione(int a, int b) {
        int risultato = a + b;
        System.err.println(risultato);
    }
}


```

E nel caso in cui voglio che la funzione ritorni un valore basta togliere il `void`(funzione che non ritona niente) e mettere il tipo di dato che vuoi che ritorna

```Java


public class Main {

    public static void main(String[] args) {

        int risultato = addizione(4, 6);

        System.out.println(risultato);
    }

    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }
}

```
