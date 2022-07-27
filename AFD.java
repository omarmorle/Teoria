import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

public class AFD {

    public static void main(String[] args) {
        dibujoAutomata();
    }

    private static void dibujoAutomata() {
        JFrame frame = new JFrame("Automata buscador de palabras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GrafoAFD grafica = new GrafoAFD();
        frame.add(grafica);
        frame.setSize(1200, 800);
        frame.setBackground(Color.white);
        frame.setVisible(true);
    }
}