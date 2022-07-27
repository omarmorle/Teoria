import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GeneradorPalindromos {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        Scanner leer = new Scanner(System.in);
        String epsilon = "\u03B5";
        String reglas[] = {epsilon, "0", "1", "0P0", "1P1"};
        int opcion;
        int longitud;

        do {
            System.out.println("");
            System.out.println("Gramatica independiente del contexto para palindromos binarios:\n1. P->" + epsilon + "\n2. P->0\n3. P->1\n4. P->0P0\n5. P->1P1\n");
            System.out.println("Elije una opcion\n1.Ingresar la longitud del palindromo\n2.Generar un palindromo de longitud aleatoria\n3.Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Escribe la longitud: ");
                    longitud = leer.nextInt();
                    imprimeArch("--------------------------------------");
                    imprimeArch("Longitud de cadena: " + longitud);
                    System.out.println("Regla aplicada\t\tCadena");
                    imprimeArch("Cadena");
                    Palindromo(longitud, reglas);
                    break;
                case 2:
                    longitud = (int) (Math.random() * 100 + 1);
                    System.out.println("Longitud de la cadena: " + longitud);
                    imprimeArch("--------------------------------------");
                    imprimeArch("Longitud de cadena: " + longitud);
                    System.out.println("Regla aplicada\t\t\tCadena");
                    imprimeArch("Cadena");
                    Palindromo(longitud, reglas);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);
    }

    public static void Palindromo(int longitud, String[] reglas) {
        String cadena = "";
        int aleatorio;
        int tam;
        if (longitud == 0) {
            cadena = reglas[0];
            System.out.println("" + 1 + "\t\t\t" + cadena);
            imprimeArch(cadena);
            System.out.println("Palindromo generado: " + cadena);
            imprimeArch("Palindromo generado: " + cadena);
        }
        if (longitud == 1) {
            aleatorio = (int) (Math.random() * 2);
            if (aleatorio == 0) {
                cadena = reglas[1];
                System.out.println("" + 2 + "\t\t\t" + cadena);
                imprimeArch(cadena);
            } else if (aleatorio == 1) {
                cadena = reglas[2];
                System.out.println("" + 3 + "\t\t\t" + cadena);
                imprimeArch(cadena);
            }
            System.out.println("Palindromo generado: " + cadena);
            imprimeArch("Palindromo generado: " + cadena);
        }
        if (longitud >= 2) {
            aleatorio = (int) (Math.random() * 2);
            if (aleatorio == 0) {
                cadena = reglas[3];
                System.out.println(4 + "\t\t\t" + cadena);
                imprimeArch(cadena);
            } else if (aleatorio == 1) {
                cadena = reglas[4];
                System.out.println(5 + "\t\t\t" + cadena);
                imprimeArch(cadena);
            }
            if (longitud % 2 == 0) {
                do {
                    tam = cadena.length();
                    if (tam == longitud + 1) {
                        cadena = producionesPar(cadena, reglas);
                        System.out.println(cadena);
                        imprimeArch(cadena);
                        break;
                    } else {
                        cadena = producciones(cadena, reglas);
                        System.out.println(cadena);
                        imprimeArch(cadena);
                    }
                    if (longitud == tam) {
                        break;
                    }
                } while (tam <= longitud);
            } else {
                do {
                    tam = cadena.length();
                    if (tam == longitud) {
                        cadena = produccionImpar(cadena, reglas);
                        System.out.println(cadena);
                        imprimeArch(cadena);
                        break;
                    } else {
                        cadena = producciones(cadena, reglas);
                        System.out.println(cadena);
                        imprimeArch(cadena);
                    }
                } while (tam <= longitud);
            }
            System.out.println("Palindromo generado: " + cadena);
            imprimeArch("Palindromo generado: " + cadena);
        }
    }

    public static String producciones(String cadena, String[] reglas) {
        char c;
        int lon;
        int random;
        String cadaux = "";
        lon = cadena.length();
        for (int i = 0; i < lon; i++) {
            c = cadena.charAt(i);
            if (c != 'P') {
                cadaux = cadaux + c;
            } else if (c == 'P') {
                random = (int) (Math.random() * 2);
                if (random == 0) {
                    cadaux = cadaux + reglas[3];
                    System.out.print(4 + "\t\t\t");
                } else if (random == 1) {
                    cadaux = cadaux + reglas[4];
                    System.out.print(5 + "\t\t\t");
                }
            }
        }
        return cadaux;
    }

    public static String producionesPar(String cadena, String[] reglas) {
        char c;
        int lon;
        String cadaux = "";
        lon = cadena.length();
        for (int i = 0; i < lon; i++) {
            c = cadena.charAt(i);
            if (c != 'P') {
                cadaux = cadaux + c;
            } else if (c == 'P') {
                cadaux = cadaux + "";
            }
        }
        System.out.print(1 + "\t\t\t");
        return cadaux;
    }

    public static String produccionImpar(String cadena, String[] reglas) {
        char c;
        int lon;
        int random;
        String cadaux = "";
        lon = cadena.length();
        for (int i = 0; i < lon; i++) {
            c = cadena.charAt(i);
            if (c != 'P') {
                cadaux = cadaux + c;
            } else if (c == 'P') {
                random = (int) (Math.random() * 2);
                if (random == 0) {
                    cadaux = cadaux + reglas[1];
                    System.out.print(2 + "\t\t\t");
                } else if (random == 1) {
                    cadaux = cadaux + reglas[2];
                    System.out.print(3 + "\t\t\t");
                }

            }
        }
        return cadaux;
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
}
