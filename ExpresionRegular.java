import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExpresionRegular {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        BufferedWriter cadenas = new BufferedWriter(new FileWriter("Cadenas.txt"));
        String resp = "";
        String epsilon = "\u03B5";
        System.out.println("Expresion: L((O+10)*(" + epsilon + "+1))");
        cadenas.write("Expresion: L((O+10)*(" + epsilon + "+1))");
        do {
            for (int a = 0; a < 10; a++) {
                System.out.println();
                cadenas.newLine();
                int ck = (int) (Math.random() * 2);
                int r2 = (int) (Math.random() * 2);
                int r3 = (int) (Math.random() * 3);
                int r4 = (int) (Math.random() * 100 + 1);
                if (ck != 0) {
                    String sub = "";
                    switch (r3) {
                        case 0:
                            sub = "0";
                            break;
                        case 1:
                            sub = "10";
                            break;
                        case 2:
                            sub = "010";
                            break;
                        default:
                            break;
                    }
                    String concatenacion = "";
                    if (r2 != 0) {
                        for (int i = 0; i < r4; i++) {
                            if (i == r4 - 1) {
                                concatenacion += sub + "1";
                                break;
                            }
                            concatenacion += sub;
                        }
                        System.out.println("L((O+10)*(" + epsilon + "+1)) = {" + concatenacion + "}");
                        cadenas.write("L((O+10)*(" + epsilon + "+1)) = {" + concatenacion + "}");
                        cadenas.newLine();
                    } else {
                        for (int i = 0; i < r4; i++) {
                            concatenacion += sub;
                        }
                        System.out.println("L((O+10)*(" + epsilon + "+1)) = {" + concatenacion + "}");
                        cadenas.write("L((O+10)*(" + epsilon + "+1)) = {" + concatenacion + "}");
                        cadenas.newLine();
                    }
                } else {
                    if (r2 != 0) {
                        System.out.println("L((O+10)*(" + epsilon + "+1))={1}");
                        cadenas.write("L((O+10)*(" + epsilon + "+1))={1}");
                        cadenas.newLine();
                    } else {
                        System.out.println("L((O+10)*(" + epsilon + "+1))={" + epsilon + "}");
                        cadenas.write("L((O+10)*(" + epsilon + "+1))={" + epsilon + "}");
                        cadenas.newLine();
                    }
                }
            }
            System.out.println();
            System.out.println("Quieres generar 10 cadenas mas?(s/n)");
            resp = leer.next();
        } while (resp.equals("s"));
        cadenas.close();
    }
}
