import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

public class Simula {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        int contador = 0;

        Simulador s = new Simulador();
        s.leearchivo(contador);

        return;
	}
}
