package seanca1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // variabel final - konstante
    private static final String AKADEMIA_TCT = "Akademia TCT";
    // variabel statik
    private static String modelPC;
    // VARIABLA INSTANCE - ka nje vlere default gjithmone, mund te aksesohet dhe pa i dhene nje vlere
    private int numer; // akses privat (1)
    String ngjyra; // akses default(package private) (2)
    protected char shkronjaImePare = 'A'; // akses protected (3)
    public boolean eshteDiteKursi; // akses publik (4)

    public static void main(String[] args) {
        // variabel lokal
       /* String emri = "Geri";
        if (3 < 4) {
            boolean eshteMeVogel = true;
            System.out.println("Numri 3 eshte me i vogel se numri 4" + eshteMeVogel);
        }*/

//        System.out.println("Vlera qe ndodhet te variabli eshteMeVogel eshte : " + eshteMeVogel); ESHTE E GABUAR

//        int mosha;
//        System.out.println("Mosha eshte " + mosha);

//        krahasoNumra(2, 3);
//        ngjitShkalle();
//        System.out.printf("Ngjyra eshte %s %d", "KUQE", 1);
//        printoNumraCifMeTeVegjelSe(3);
        for (int i=1;i<=10;i++) {
            if(i==5) {
                continue;
            }
            System.out.println("numri eshte " + i);
        }
    }

    // maximumi = 1
    // -
    // maximumi = 2
    // 2
    // maximumi = 3
    // 2
    // maximumi = 10
    // 2, 4, 6, 8, 10
    // maximumi = 15
    // 2, 4, 6, 8, 10, 12, 14
    public static void printoNumraCifMeTeVegjelSe(int maximumi) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("iteracioni " + i);
            if (i > maximumi) {
//                break;
                continue;
            }
            System.out.println("U futa brenda ciklit for");
            if (i % 2 == 0) {
                System.out.println("Numri " + i);
            }
            System.out.println("Mbarova ekzekutimin e trupit te ciklit for per kete iteracion");
        }
    }

    // metode pa parameter qe nuk ka tip kthimi, pra eshte VOID
    public static void gjejPerimeter() {

    }

    // metode pa parameter qe ka nje tip kthimi, tipi i kthimit mund te jete primitiv ose jo primitiv
    public int gjejSyprinen() {
        return 5 * 5;
    }

    // metode me 1 parameter
    public void printoEmerInstruktor(String emri) {
        System.out.println("Emri eshte " + emri);
    }

    // metode me >= 2 parametra
    public void printoGjatesiPerDrejtekendesh(int gjatesi, int gjeresi) {
        System.out.println("gjatesi " + gjatesi);
        System.out.println("gjeresi " + gjeresi);
    }

    public static int krahasoNumra(int numri1, int numri2) {
//        return numri1 > numri2 ? numri1 : numri2; // ternary operator
        System.out.println("FIlloj krahasimin e numrave");
        int rezultati;
        if (numri1 > numri2) {
            System.out.println("Numri " + numri1 + " ehste me i madh se " + numri2);
            rezultati = numri1;
        } else if (numri2 > numri1) {
            System.out.println("Numri " + numri2 + " eshte me i madh se " + numri1);
            rezultati = numri2;
        } else {
            System.out.println("Numri " + numri2 + " eshte i barabarte me " + numri1);
            rezultati = numri1;
        }
        System.out.println("Perfundova me krahasimin e numrave");
        return rezultati;
    }

    public static void ngjitShkalle() {
        for (int indexShkalle = 0; indexShkalle < 5; indexShkalle++) {
            System.out.println("Ngjita shkallen " + (indexShkalle + 1));
        }
    }

    public static void printoNgjyra() {
        List<String> ngjyrat = new ArrayList<>();
        ngjyrat.add("kuqe");
        ngjyrat.add("blu");

        for (int indexNgjyra = 0; indexNgjyra < ngjyrat.size(); indexNgjyra++) {
            System.out.println("Ngjyra eshte " + ngjyrat.get(indexNgjyra)); // ngjyrat[indexNgjyra]
        }

        for (String ngjyre : ngjyrat) {
            System.out.printf("Ngjyra eshte %s %n", ngjyre, 1);
        }
    }

}
