import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Simulador {

    public static void leearchivo(int tam) {
        String rutas [] = new String[3];
        
        try {
            FileReader fpp = new FileReader("Ganadores.txt");
            BufferedReader bf = new BufferedReader(fpp);
            int k = (int) bf.lines().count();
            fpp.close();
            for (int i = 0; i < 3; i++) {
                FileReader fr = new FileReader("Ganadores.txt");
                BufferedReader br = new BufferedReader(fr);
                String linea = "";
                int r = 0;
                r = (int)(Math.random()*k+1);
                for (int j = 0; j < r; j++) {
                    linea = br.readLine();
                }
                rutas[i]=linea;
                fr.close();
            }
        } catch (Exception e) {
        }
        Ventana v = new Ventana(rutas);       
    }

}