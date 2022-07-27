import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Simulador2 {

    public static void leearchivo(int tam) {
        String rutas [] = new String[2];
        
        try {
            int r = 0;

            FileReader fpp = new FileReader("Ganadores.txt");
            BufferedReader bf = new BufferedReader(fpp);
            int k = (int) bf.lines().count();
            fpp.close();

            FileReader fr = new FileReader("Ganadores.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            r = (int)(Math.random()*k+1);
            for (int j = 0; j < r; j++) {
                linea = br.readLine();
            }
            rutas[0]=linea;

            FileReader fr2 = new FileReader("Ganadoresb.txt");
            BufferedReader br2 = new BufferedReader(fr2);
            String linea2 = "";
            for (int j = 0; j < r; j++) {
                linea2 = br2.readLine();
            }
            rutas[1]=linea2;
            fr2.close();fr.close();

        } catch (Exception e) {
        }
        Ventana2 v = new Ventana2(rutas);       
    }

}