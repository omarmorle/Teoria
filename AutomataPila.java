import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Scanner;
import java.util.Stack;

public class AutomataPila {

    public static Stack pila = new Stack();

    public static void main(String[] args) throws InterruptedException {
        Scanner leer = new Scanner(System.in);
        int opcion;
        String cadena;

        boolean bandera;
        do {
            System.out.println("");
            System.out.println("Automata de pila\nElige una opcion:\n1.Ingresar una cadena\n2.Generar una cadena aleatoria\n3.Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    pila.push("Z0");
                    System.out.print("Ingresa cadena: ");
                    cadena = leer.next();
                    System.out.println("Cadena ingresada: " + cadena);
                    imprimeArch("Cadena ingresada: " + cadena);
                    System.out.println("Proceso:");
                    imprimeArch("Proceso:");
                    bandera = Automata(cadena);
                    if (bandera == true) {
                        System.out.println("La cadena ha sido aceptada");
                        imprimeArch("La cadena ha sido aceptada");
                    } else {
                        System.out.println("La cadena ha sido rechazada");
                        imprimeArch("La cadena ha sido rechazada");
                    }
                    break;
                case 2:
                    pila.push("Z0");
                    cadena = generaCadena();
                    System.out.println("Cadena generada: " + cadena);
                    imprimeArch("Cadena generada: " + cadena);
                    System.out.println("Proceso:");
                    imprimeArch("Proceso:");
                    bandera = Automata(cadena);
                    if (bandera == true) {
                        System.out.println("Aceptada");
                        imprimeArch("Aceptada");
                    } else {
                        System.out.println("Rechazada");
                        imprimeArch("Rechazada");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 3);
    }

    public static boolean Automata(String cadena) throws InterruptedException {
        String delta = "\u03B4";
        String epsilon = "\u03B5";
        CharacterIterator it = new StringCharacterIterator(cadena);
        boolean bandera = false;
        char c;
        String cadaux = "";
        c = it.first();
        String agrega = "";
        String quita = "";
        String trans = "";
        int contador = 0;
        if (c == '1') {
            bandera = false;
        } else {
            agrega += pila.peek().toString();
            System.out.println(cadena);
            imprimeArch(cadena);
            System.out.println("^\n"
                    + "|\n"
                    + "q\n"
                    + "|\n"
                    + "v\n"
                    + agrega + "\n");
            imprimeArch("^\n"
                    + "|\n"
                    + "q\n"
                    + "|\n"
                    + "v\n"
                    + agrega + "\n");
            System.out.println(delta + "(q, 0, " + epsilon + ") = {(q1, " + agrega + ")}");
            imprimeArch(delta + "(q, 0, " + epsilon + ") = {(q1, " + agrega + ")}");
            Thread.sleep(2000);
            while (c == '0') {
                System.out.println("-------------------------");
                imprimeArch("-------------------------");
                cadaux = cadena.substring(it.getIndex() + 1);
                System.out.println(cadaux);
                imprimeArch(cadaux);
                pila.push("X");
                agrega += pila.peek().toString();
                trans = pila.elementAt(contador).toString() + pila.peek().toString();
                System.out.println("^\n"
                        + "|\n"
                        + "q\n"
                        + "|\n"
                        + "v\n"
                        + agrega + "\n");
                imprimeArch("^\n"
                        + "|\n"
                        + "q\n"
                        + "|\n"
                        + "v\n"
                        + agrega + "\n");
                System.out.println(delta + "(q, 0, " + pila.peek() + ") = {(q1, " + trans + ")}");
                imprimeArch(delta + "(q, 0, " + pila.peek() + ") = {(q1, " + trans + ")}");
                Thread.sleep(2000);
                c = it.next();
                contador++;
            }
            while (c == '1') {
                if (pila.isEmpty()) {
                    bandera = false;
                    break;
                }
                if (c == CharacterIterator.DONE) {
                    break;
                }
                System.out.println("-------------------------");
                imprimeArch("-------------------------");
                cadaux = cadena.substring(it.getIndex() + 1);
                System.out.println(cadaux);
                imprimeArch(cadaux);
                pila.pop();
                for (int i = 0; i < (contador); i++) {
                    quita += pila.elementAt(i);
                }
                System.out.println("^\n"
                        + "|\n"
                        + "q\n"
                        + "|\n"
                        + "v\n"
                        + quita + "\n");
                imprimeArch("^\n"
                        + "|\n"
                        + "q\n"
                        + "|\n"
                        + "v\n"
                        + quita + "\n");
                System.out.println(delta + "(p, 1, " + pila.peek() + ") = {(p, " + epsilon + ")}");
                imprimeArch(delta + "(p, 1, " + pila.peek() + ") = {(p, " + epsilon + ")}");
                Thread.sleep(2000);
                c = it.next();
                quita = "";
                contador--;
            }
            if ((!pila.isEmpty()) && (pila.peek() == "Z0") && (c == CharacterIterator.DONE)) {
                System.out.println("-------------------------");
                imprimeArch("-------------------------");
                System.out.println(delta + "(p, " + epsilon + ", " + pila.peek() + ") = {(f, " + pila.peek() + ")}");
                imprimeArch(delta + "(p, " + epsilon + ", " + pila.peek() + ") = {(f, " + pila.peek() + ")}");
                Thread.sleep(2000);
                pila.pop();
                bandera = true;
            } else {
                while (!pila.empty()) {
                    pila.pop();
                    bandera = false;
                }
            }
        }
        return bandera;
    }

    public static String generaCadena() {
        String cad = "";
        String c;
        int length = 0, i = 0;
        i = (int) (Math.random() * 10 + 1);
        while (length < i) {
            c = Integer.toString((int) (Math.random() * 2));
            cad += c;
            length++;
        }
        return cad;
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
