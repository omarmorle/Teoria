import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class MaquinaTuring {

    static String entrada;
    static StringBuilder cadena;
    static char[] cadarray;
    static int cont;
    static String delta = "\u03B4";

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.println("-----------");
            System.out.println("1 Manual");
            System.out.println("2 Automático ");
            System.out.println("3 Salir");
            System.out.print("Elija el Modo:");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese cadena binaria");
                    entrada = leer.next();
                    cadena = new StringBuilder("B" + entrada + "B");
                    inicio();
                    break;
                case 2:
                    entrada = generaCadena();
                    cadena = new StringBuilder("B" + entrada + "B");
                    inicio();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opc != 3);
        System.exit(0);
    }

    public static void inicio() {
        cont = 1;
        imprimeArch("-------------------");
        imprimeArch("Cadena: " + cadena);
        imprimeTransi("-------------------");
        imprimeTransi("Cadena: " + cadena);
        q0();
    }

    public static void q0() {
        if (cont < cadena.length()) {
            System.out.println("q0, " + cadena);
            imprimeArch("q0, " + cadena);
            if (cadena.charAt(cont) == '0') {
                cadena.setCharAt(cont, 'X');
                cont++;
                imprimeTransi(delta+"(q0, 0) = (q1, X, R)");
                q1();
            } else if (cadena.charAt(cont) == 'Y') {
                cadena.setCharAt(cont, 'Y');
                cont++;
                imprimeTransi(delta+"(q0, Y) = (q1, Y, R)");
                q3();
            } else if (cadena.charAt(cont) == '1' || cadena.charAt(cont) == 'X' || cadena.charAt(cont) == 'B') {
                System.out.println("Cadena no aceptada");
                imprimeArch("Cadena no aceptada");
                imprimeTransi("Cadena no aceptada");
            }
        } else if (cont == cadena.length()) {
            System.out.println("Fin de cadena");
            imprimeArch("Fin de cadena");
            imprimeTransi("Fin de cadena");
        }
    }

    public static void q1() {
        if (cont < cadena.length()) {
            System.out.println("q1, " + cadena);
            imprimeArch("q1, " + cadena);
            if (cadena.charAt(cont) == '0') {
                cadena.setCharAt(cont, '0');
                cont++;
                imprimeTransi(delta+"(q1, 0) = (q1, 0, R)");
                q1();
            } else if (cadena.charAt(cont) == '1') {
                cadena.setCharAt(cont, 'Y');
                cont--;
                imprimeTransi(delta+"(q1, 1) = (q2, Y, L)");
                q2();
            } else if (cadena.charAt(cont) == 'Y') {
                cadena.setCharAt(cont, 'Y');
                cont++;
                imprimeTransi(delta+"(q1, Y) = (q1, Y, R)");
                q1();
            } else if (cadena.charAt(cont) == 'X' || cadena.charAt(cont) == 'B') {
                System.out.println("Cadena no aceptada");
                imprimeArch("Cadena no aceptada");
                imprimeTransi("Cadena no aceptada");
            }
        } else if (cont == cadena.length()) {
            System.out.println("Fin de cadena");
            imprimeArch("Fin de cadena");
            imprimeTransi("Fin de cadena");
        }
    }

    public static void q2() {
        if (cont < cadena.length()) {
            System.out.println("q2, " + cadena);
            imprimeArch("q2, " + cadena);
            if (cadena.charAt(cont) == '0') {
                cadena.setCharAt(cont, '0');
                cont--;
                imprimeTransi(delta+"(q2, 0) = (q2, 0, L)");
                q2();
            } else if (cadena.charAt(cont) == 'X') {
                cadena.setCharAt(cont, 'X');
                cont++;
                imprimeTransi(delta+"(q2, X) = (q0, X, R)");
                q0();
            } else if (cadena.charAt(cont) == 'Y') {
                cadena.setCharAt(cont, 'Y');
                cont--;
                imprimeTransi(delta+"(q2, Y) = (q2, Y, L)");
                q2();
            } else if (cadena.charAt(cont) == '1' || cadena.charAt(cont) == 'B') {
                System.out.println("Cadena no aceptada");
                imprimeArch("Cadena no aceptada");
                imprimeTransi("Cadena no aceptada");
            }
        } else if (cont == cadena.length()) {
            System.out.println("Fin de cadena");
            imprimeArch("Fin de cadena");
            imprimeTransi("Fin de cadena");
        }
    }

    public static void q3() {
        if (cont < cadena.length()) {
            System.out.println("q3, " + cadena);
            imprimeArch("q3, " + cadena);
            if (cadena.charAt(cont) == 'Y') {
                cadena.setCharAt(cont, 'Y');
                cont++;
                imprimeTransi(delta+"(q3, Y) = (q3, Y, R)");
                q3();
            } else if (cadena.charAt(cont) == 'B') {
                cadena.setCharAt(cont, 'B');
                cont++;
                imprimeTransi(delta+"(q3, B) = (q4, B, R)");
                q4();
            } else if (cadena.charAt(cont) == '0' || cadena.charAt(cont) == '1' || cadena.charAt(cont) == 'X') {
                System.out.println("Cadena no aceptada");
                imprimeArch("Cadena no aceptada");
                imprimeTransi("Cadena no aceptada");
            }
        } else if (cont == cadena.length()) {
            System.out.println("Fin de cadena");
            imprimeArch("Fin de cadena");
            imprimeTransi("Fin de cadena");
        }
    }

    public static void q4() {
        System.out.println("q4, " + cadena);
        imprimeArch("q4, " + cadena);
        imprimeTransi("q4, " + cadena);
        System.out.println("Resultado: " + cadena);
        System.out.println("Aceptada");
        imprimeArch("Resultado: " + cadena);
        imprimeArch("Aceptada");
        imprimeTransi("Resultado: " + cadena);
        imprimeTransi("Aceptada");
    }

    public static int aleat() {
        Random rnm = new Random();
        int valor = (int) (rnm.nextDouble() * 2 + 0);
        return valor;
    }

    public static String generaCadena() {
        Random rnm = new Random();
        char[] cad;
        char bina[] = {'0', '1'};
        int longi = (int) (rnm.nextDouble() * 50 + 0);
        cad = new char[longi];
        for (int i = 0; i < cad.length; i++) {
            cad[i] = bina[aleat()];
        }
        System.out.println(String.valueOf(cad));
        return String.valueOf(cad);
    }

    public static void imprimeArch(String toArch) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("proceso.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(toArch);
        } catch (Exception e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
            }
        }
    }

    public static void imprimeTransi(String toArch) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter("transiciones.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(toArch);
        } catch (Exception e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
                if (null != fichero) {
                    fichero.close();
                }

            } catch (Exception e2) {
            }
        }
    }
}
