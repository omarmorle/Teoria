import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ventana extends JFrame implements ActionListener, Runnable {

    Thread cambiar;
    String p[] = new String[3];
    JPanel jprex, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16;
    JButton sim1, sim2, sim3;
    JPanel jp1, jp2;
    JLabel text, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16;
    int contador = 1;
    String cadena = "";
    char sig;
    String aux = "";
    ArrayList<String> palabras = new ArrayList<String>();

    Ventana(String[] a) {
        this.setTitle("Simulador");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLayout(null);
        this.setSize(800, 800);
        for (int i = 0; i < 3; i++) {
            p[i] = a[i];
        }
        inicializa();
        this.setVisible(true);
    }

    public void inicializa() {
        jp1 = new JPanel();
        jprex = new JPanel();
        text= new JLabel("Presiona una simulacion y aparecera el camino");
        jp1.setLayout(new FlowLayout());
        jprex.setLayout(new FlowLayout());
        Border line = BorderFactory.createLineBorder(Color.black, 1);
        sim1 = new JButton("Simulacion 1");
        sim2 = new JButton("Simulacion 2");
        sim3 = new JButton("Simulacion 3");

        q1 = new JPanel();
        q2 = new JPanel();
        q3 = new JPanel();
        q4 = new JPanel();
        q5 = new JPanel();
        q6 = new JPanel();
        q7 = new JPanel();
        q8 = new JPanel();
        q9 = new JPanel();
        q10 = new JPanel();
        q11 = new JPanel();
        q12 = new JPanel();
        q13 = new JPanel();
        q14 = new JPanel();
        q15 = new JPanel();
        q16 = new JPanel();
        
        a1 = new JLabel("q1");
        a2 = new JLabel("q2");
        a3 = new JLabel("q3");
        a4 = new JLabel("q4");
        a5 = new JLabel("q5");
        a6 = new JLabel("q6");
        a7 = new JLabel("q7");
        a8 = new JLabel("q8");
        a9 = new JLabel("q9");
        a10 = new JLabel("q10");
        a11 = new JLabel("q11");
        a12 = new JLabel("q12");
        a13 = new JLabel("q13");
        a14 = new JLabel("q14");
        a15 = new JLabel("q15");
        a16 = new JLabel("q16");
        
        a1.setForeground(Color.gray);
        a2.setForeground(Color.gray);
        a3.setForeground(Color.gray);
        a4.setForeground(Color.gray);
        a5.setForeground(Color.gray);
        a6.setForeground(Color.gray);
        a7.setForeground(Color.gray);
        a8.setForeground(Color.gray);
        a9.setForeground(Color.gray);
        a10.setForeground(Color.gray);
        a11.setForeground(Color.gray);
        a12.setForeground(Color.gray);
        a13.setForeground(Color.gray);
        a14.setForeground(Color.gray);
        a15.setForeground(Color.gray);
        a16.setForeground(Color.gray);

        sim1.addActionListener(this);
        sim2.addActionListener(this);
        sim3.addActionListener(this);

        q1.setSize(100, 100);
        q1.setLocation(200, 250);
        q1.setBorder(line);
        q1.setBackground(Color.black);
        q1.add(a1);

        q2.setSize(100, 100);
        q2.setLocation(300, 250);
        q2.setBorder(line);
        q2.setBackground(Color.red);
        q2.add(a2);

        q3.setSize(100, 100);
        q3.setLocation(400, 250);
        q3.setBorder(line);
        q3.setBackground(Color.black);
        q3.add(a3);

        q4.setSize(100, 100);
        q4.setLocation(500, 250);
        q4.setBorder(line);
        q4.setBackground(Color.red);
        q4.add(a4);

        q5.setSize(100, 100);
        q5.setLocation(200, 350);
        q5.setBorder(line);
        q5.setBackground(Color.red);
        q5.add(a5);

        q6.setSize(100, 100);
        q6.setLocation(300, 350);
        q6.setBorder(line);
        q6.setBackground(Color.black);
        q6.add(a6);

        q7.setSize(100, 100);
        q7.setLocation(400, 350);
        q7.setBorder(line);
        q7.setBackground(Color.red);
        q7.add(a7);

        q8.setSize(100, 100);
        q8.setLocation(500, 350);
        q8.setBorder(line);
        q8.setBackground(Color.black);
        q8.add(a8);

        q9.setSize(100, 100);
        q9.setLocation(200, 450);
        q9.setBorder(line);
        q9.setBackground(Color.black);
        q9.add(a9);

        q10.setSize(100, 100);
        q10.setLocation(300, 450);
        q10.setBorder(line);
        q10.setBackground(Color.red);
        q10.add(a10);

        q11.setSize(100, 100);
        q11.setLocation(400, 450);
        q11.setBorder(line);
        q11.setBackground(Color.black);
        q11.add(a11);

        q12.setSize(100, 100);
        q12.setLocation(500, 450);
        q12.setBorder(line);
        q12.setBackground(Color.red);
        q12.add(a12);

        q13.setSize(100, 100);
        q13.setLocation(200, 550);
        q13.setBorder(line);
        q13.setBackground(Color.red);
        q13.add(a13);

        q14.setSize(100, 100);
        q14.setLocation(300, 550);
        q14.setBorder(line);
        q14.setBackground(Color.black);
        q14.add(a14);

        q15.setSize(100, 100);
        q15.setLocation(400, 550);
        q15.setBorder(line);
        q15.setBackground(Color.red);
        q15.add(a15);

        q16.setSize(100, 100);
        q16.setLocation(500, 550);
        q16.setBorder(line);
        q16.setBackground(Color.black);
        q16.add(a16);

        jp1.add(sim1);
        jp1.add(sim2);
        jp1.add(sim3);
        jp1.setSize(400, 50);
        jp1.setLocation(200, 50);

        jprex.add(text);
        jprex.setSize(400, 50);
        jprex.setLocation(200, 125);
        jprex.setBorder(line);
        
        this.getContentPane().add(jprex);
        this.getContentPane().add(jp1);
        this.getContentPane().add(q1);
        this.getContentPane().add(q2);
        this.getContentPane().add(q3);
        this.getContentPane().add(q4);
        this.getContentPane().add(q5);
        this.getContentPane().add(q6);
        this.getContentPane().add(q7);
        this.getContentPane().add(q8);
        this.getContentPane().add(q9);
        this.getContentPane().add(q10);
        this.getContentPane().add(q11);
        this.getContentPane().add(q12);
        this.getContentPane().add(q13);
        this.getContentPane().add(q14);
        this.getContentPane().add(q15);
        this.getContentPane().add(q16);
    }

    public void inicia(int pos) {
        cadena = p[pos];
        for (int i = 0; i < cadena.length(); i++) {
            sig = cadena.charAt(i);
            if (sig != ' ') {
                aux += sig;
            } else {
                palabras.add(aux);
                aux = "";
            }

        }
        cambiar = new Thread(this);
        cambiar.start();

    }

    public void stop() {
        if (cambiar != null) {
            cambiar.interrupt();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("Simulacion 1")) {
            text.setText(p[0]);
            inicia(0);
        } else if (comando.equals("Simulacion 2")) {
            text.setText(p[1]);
            inicia(1);
        } else if (comando.equals("Simulacion 3")) {
            text.setText(p[2]);
            inicia(2);
        }
    }

    @Override
    public void run() {
        String c;
        try {
            for (int i = 0; i < palabras.size(); i++) {
                c = palabras.get(i);
                if ("q1".equals(c)) {
                    q1.setBackground(Color.white);
                    cambiar.sleep(500);
                    q1.setBackground(Color.black);
                } else if ("q2".equals(c)) {
                    q2.setBackground(Color.white);
                    cambiar.sleep(500);
                    q2.setBackground(Color.red);
                } else if ("q3".equals(c)) {
                    q3.setBackground(Color.white);
                    cambiar.sleep(500);
                    q3.setBackground(Color.black);
                } else if ("q4".equals(c)) {
                    q4.setBackground(Color.white);
                    cambiar.sleep(500);
                    q4.setBackground(Color.red);
                } else if ("q5".equals(c)) {
                    q5.setBackground(Color.white);
                    cambiar.sleep(500);
                    q5.setBackground(Color.red);
                } else if ("q6".equals(c)) {
                    q6.setBackground(Color.white);
                    cambiar.sleep(500);
                    q6.setBackground(Color.black);
                } else if ("q7".equals(c)) {
                    q7.setBackground(Color.white);
                    cambiar.sleep(500);
                    q7.setBackground(Color.red);
                } else if ("q8".equals(c)) {
                    q8.setBackground(Color.white);
                    cambiar.sleep(500);
                    q8.setBackground(Color.black);
                } else if ("q9".equals(c)) {
                    q9.setBackground(Color.white);
                    cambiar.sleep(500);
                    q9.setBackground(Color.black);
                } else if ("q10".equals(c)) {
                    q10.setBackground(Color.white);
                    cambiar.sleep(500);
                    q10.setBackground(Color.red);
                } else if ("q11".equals(c)) {
                    q11.setBackground(Color.white);
                    cambiar.sleep(500);
                    q11.setBackground(Color.black);
                } else if ("q12".equals(c)) {
                    q12.setBackground(Color.white);
                    cambiar.sleep(500);
                    q12.setBackground(Color.red);
                } else if ("q13".equals(c)) {
                    q13.setBackground(Color.white);
                    cambiar.sleep(500);
                    q13.setBackground(Color.red);
                } else if ("q14".equals(c)) {
                    q14.setBackground(Color.white);
                    cambiar.sleep(500);
                    q14.setBackground(Color.black);
                } else if ("q15".equals(c)) {
                    q15.setBackground(Color.white);
                    cambiar.sleep(500);
                    q15.setBackground(Color.red);
                } else if ("q16".equals(c)) {
                    q16.setBackground(Color.white);
                    cambiar.sleep(500);
                    q16.setBackground(Color.black);
                }
            }
            palabras.clear();
            JOptionPane.showMessageDialog(null, "LISTO");
            stop();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
