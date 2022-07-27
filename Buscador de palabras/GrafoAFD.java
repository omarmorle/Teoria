import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
public class GrafoAFD extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        //Lineas rectas
        g.drawLine(50,375,150,375);//q0
        g.drawLine(150,365,185,270);//q0-q1
        g.drawLine(150,383,195,270);//q0-q1
        g.drawLine(130,375,174,670);//q0-q2
        g.drawLine(140,375,182,670);//q0-q2
        g.drawLine(197,270,197,670);//q1-q2
        g.drawLine(185,270,330,270);//q1-q5
        g.drawLine(185,280,450,280);//q1-q3
        g.drawLine(330,270,191,670);//q3-q2
        g.drawLine(185,270,330,670);//q1-q4
        g.drawLine(330,270,450,270);//q3-q5
        g.drawLine(450,270,570,50);//q5-q7
        g.drawLine(450,270,570,150);//q5-q8
        g.drawLine(450,270,570,390);//q5-q9
        g.drawLine(450,270,570,500);//q5-q10
        g.drawLine(570,75,850,75);//q7-q12-q17
        g.drawLine(570,175,950,175);//q8-q13-q18-q22
        g.drawLine(570,375,950,375);//q9-q14-q19-q23
        g.drawLine(570,475,950,475);//q10-q15-q20-q24
        g.drawLine(175,674,1050,674);//q2-...-q26
        g.drawLine(175,684,1070,684);//q2-q4
        g.drawLine(302,674,130,375);//q0-q4
        g.drawLine(182,670,450,270);//q2-q5
        g.drawLine(150,368,450,270);//q0-q5
        g.drawLine(177,270,460,670);//q1-q6
        g.drawLine(150,368,460,670);//q0-q6
        g.drawLine(175,684,570,75);//q2-q7
        g.drawLine(570,75,195,298);//q1-q7
        g.drawLine(150,368,570,75);//q0-q7
        g.drawLine(570,75,570,670);//q7-q11
        g.drawLine(570,75,570,670);//q7-q11
        g.drawLine(150,368,570,175);//q0-q8
        g.drawLine(177,270,570,175);//q1-q8
        g.drawLine(175,684,570,175);//q2-q8
        g.drawLine(150,368,570,375);//q0-q9
        g.drawLine(177,270,570,375);//q1-q9
        g.drawLine(173,668,570,375);//q2-q9
        g.drawLine(150,368,570,475);//q0-q10
        g.drawLine(177,270,570,475);//q1-q10
        g.drawLine(173,668,570,475);//q2-q10
        g.drawLine(150,368,570,675);//q0-q11
        g.drawLine(150,368,700,75);//q0-q12
        g.drawLine(177,270,700,75);//q1-q12
        g.drawLine(173,668,700,75);//q2-q12
        g.drawLine(150,368,700,175);//q0-q13
        g.drawLine(177,270,700,175);//q1-q13
        g.drawLine(173,668,700,175);//q2-q13
        g.drawLine(150,368,700,375);//q0-q14
        g.drawLine(177,270,700,375);//q1-q14
        g.drawLine(173,668,700,375);//q2-q14
        g.drawLine(150,368,700,475);//q0-q15
        g.drawLine(177,270,700,475);//q1-q15
        g.drawLine(173,668,700,475);//q2-q15
        g.drawLine(150,368,700,675);//q0-q16
        g.drawLine(177,270,700,675);//q1-q16
        g.drawLine(330,270,700,675);//q3-q16
        g.drawLine(150,368,825,75);//q0-q17
        g.drawLine(177,270,825,75);//q1-q17
        g.drawLine(173,668,825,75);//q2-q17
        g.drawLine(150,368,825,175);//q0-q18
        g.drawLine(177,270,825,175);//q1-q18
        g.drawLine(173,668,825,175);//q2-q18
        g.drawLine(150,368,825,375);//q0-q19
        g.drawLine(177,270,825,375);//q1-q19
        g.drawLine(173,668,825,375);//q2-q19
        g.drawLine(150,368,825,475);//q0-q20
        g.drawLine(177,270,825,475);//q1-q20
        g.drawLine(150,368,825,675);//q0-q21
        g.drawLine(177,270,825,675);//q1-q21
        g.drawLine(150,368,950,175);//q0-q22
        g.drawLine(177,270,950,175);//q1-q22
        g.drawLine(173,668,950,175);//q2-q22
        g.drawLine(150,368,950,375);//q0-q23
        g.drawLine(177,270,950,375);//q1-q23
        g.drawLine(173,668,950,375);//q2-q23
        g.drawLine(150,368,950,475);//q0-q24
        g.drawLine(177,270,950,475);//q1-q24
        g.drawLine(173,668,950,475);//q2-q24
        g.drawLine(150,368,950,675);//q0-q25
        g.drawLine(177,270,950,675);//q1-q25
        g.drawLine(150,368,1050,675);//q0-q26
        g.drawLine(177,270,1050,675);//q1-q26

        g.drawOval(110,330,30,30);
        g.drawOval(180,230,30,30);
        g.drawOval(180,683,30,30);
        
        g.setColor(Color.CYAN); //Relleno

        g.fillOval(100, 350, 50, 50);//q0
        g.fillOval(175, 250, 50, 50);//q1
        g.fillOval(175, 650, 50, 50);//q2
        g.fillOval(300, 250, 50, 50);//q3
        g.fillOval(300, 650, 50, 50);//q4
        g.fillOval(425, 250, 50, 50);//q5
        g.fillOval(425, 650, 50, 50);//q6
        g.fillOval(550, 50, 50, 50);//q7
        g.fillOval(550, 150, 50, 50);//q8
        g.fillOval(550, 350, 50, 50);//q9
        g.fillOval(550, 450, 50, 50);//q10
        g.fillOval(550, 650, 50, 50);//q11
        g.fillOval(675, 50, 50, 50);//q12
        g.fillOval(675, 150, 50, 50);//q13
        g.fillOval(675, 350, 50, 50);//q14
        g.fillOval(675, 450, 50, 50);//q15
        g.fillOval(675, 650, 50, 50);//q16
        g.fillOval(800, 50, 50, 50);//q17
        g.fillOval(800, 150, 50, 50);//q18
        g.fillOval(800, 350, 50, 50);//q19
        g.fillOval(800, 450, 50, 50);//q20
        g.fillOval(800, 650, 50, 50);//q21
        g.fillOval(925, 150, 50, 50);//q22
        g.fillOval(925, 350, 50, 50);//q23
        g.fillOval(925, 450, 50, 50);//q24
        g.fillOval(925, 650, 50, 50);//q25
        g.fillOval(1050, 650, 50, 50);//q26

        g.setColor(Color.BLACK); //Borde

        g.drawOval(100, 350, 50, 50);//q0
        g.drawOval(175, 250, 50, 50);//q1
        g.drawOval(175, 650, 50, 50);//q2
        g.drawOval(300, 250, 50, 50);//q3
        g.drawOval(300, 650, 50, 50);//q4
        g.drawOval(425, 250, 50, 50);//q5
        g.drawOval(435, 260, 30, 30); //Aceptación q5
        g.drawOval(425, 650, 50, 50);//q6
        g.drawOval(550, 50, 50, 50);//q7
        g.drawOval(550, 150, 50, 50);//q8
        g.drawOval(550, 350, 50, 50);//q9
        g.drawOval(550, 450, 50, 50);//q10
        g.drawOval(550, 650, 50, 50);//q11
        g.drawOval(560, 660, 30, 30); //Aceptación q11
        g.drawOval(675, 50, 50, 50);//q12
        g.drawOval(675, 150, 50, 50);//q13
        g.drawOval(675, 350, 50, 50);//q14
        g.drawOval(675, 450, 50, 50);//q15
        g.drawOval(675, 650, 50, 50);//q16
        g.drawOval(800, 50, 50, 50);//q17
        g.drawOval(810, 60, 30, 30); //Aceptación q17
        g.drawOval(800, 150, 50, 50);//q18
        g.drawOval(800, 350, 50, 50);//q19
        g.drawOval(800, 450, 50, 50);//q20
        g.drawOval(800, 650, 50, 50);//q21
        g.drawOval(925, 150, 50, 50);//q22
        g.drawOval(935, 160, 30, 30); //Aceptación q22
        g.drawOval(925, 350, 50, 50);//q23
        g.drawOval(935, 360, 30, 30); //Aceptación q23
        g.drawOval(925, 450, 50, 50);//q24
        g.drawOval(935, 460, 30, 30); //Aceptación q24
        g.drawOval(925, 650, 50, 50);//q25
        g.drawOval(1050, 650, 50, 50);//q26
        g.drawOval(1060, 660, 30, 30); //Aceptación q26
        
        g.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        g.drawString("Inicio",50,396);
        
        g.drawString("Σ-e,w",84,329);
        g.drawString("Σ-e,w",131,329);
        g.drawString("Σ-b,e,w",161,469);
        g.drawString("e",138,469);
        g.drawString("e",189,722);
        g.drawString("w",189,247);
        g.drawString("w",181,369);
        g.drawString("w",167,369);
        g.drawString("w",226,369);
        g.drawString("e",239,266);
        g.drawString("Σ-a,e,i,m,p,w",242,326);
        g.drawString("w",239,289);
        g.drawString("e",280,396);
        g.drawString("e",380,396);
        g.drawString("e",368,376);
        g.drawString("e",428,376);
        g.drawString("w",368,173);
        g.drawString("b",375,266);
        g.drawString("p",506,396);
        g.drawString("m",506,321);
        g.drawString("a",506,155);
        g.drawString("p",616,73);
        g.drawString("p",756,73);
        g.drawString("i",506,204);
        g.drawString("n",616,173);
        g.drawString("a",756,173);
        g.drawString("r",866,173);
        g.drawString("a",616,373);
        g.drawString("i",756,373);
        g.drawString("l",866,373);
        g.drawString("y",506,672);
        g.drawString("w",616,672);
        g.drawString("i",756,672);
        g.drawString("s",866,672);
        g.drawString("h",1016,672);
        g.drawString("a",616,473);
        g.drawString("g",756,473);
        g.drawString("e",866,473);
        g.drawString("b",239,673);
        g.drawString("e",242,684);
        g.drawString("e",365,684);
        g.drawString("e",495,684);
        g.drawString("e",745,684);
        g.drawString("e",875,684);
        g.drawString("e",1025,684);
        g.drawString("a",375,673);
        g.drawString("w",433,210);
        g.drawString("Σ-e,m,w",440,373);
        g.drawString("w",440,343);
        g.drawString("e",440,478);
        g.drawString("Σ-a,e,w",211,499);
        g.drawString("Σ-e,p,w,y",360,214);
        g.drawString("Σ-e,i,w",395,250);
        g.drawString("Σ-e,a,w",440,460);
        g.drawString("w",440,527);
        g.drawString("e",440,418);
        g.drawString("Σ-e,w",275,480);
        g.drawString("w",616,109);
        g.drawString("Σ-e,p,w",616,123);
        g.drawString("e",616,153);

        g.drawString("q0",115,380);
        g.drawString("q1",193,277);
        g.drawString("q2",193,677);
        g.drawString("q3",321,277);
        g.drawString("q4",321,677);
        g.drawString("q5",441,277);
        g.drawString("q6",441,677);
        g.drawString("q7",566,77);
        g.drawString("q8",566,177);
        g.drawString("q9",566,377);
        g.drawString("q10",566,477);
        g.drawString("q11",565,677);
        g.drawString("q12",687,77);
        g.drawString("q13",687,177);
        g.drawString("q14",687,377);
        g.drawString("q15",687,477);
        g.drawString("q16",687,677);
        g.drawString("q17",813,77);
        g.drawString("q18",813,177);
        g.drawString("q19",813,377);
        g.drawString("q20",813,477);
        g.drawString("q21",813,677);
        g.drawString("q22",938,177);
        g.drawString("q23",938,377);
        g.drawString("q24",938,477);
        g.drawString("q25",938,677);
        g.drawString("q25",1063,677);

        //De izquierda a derecha
        g.fillOval(94, 370, 8, 8);
        g.fillOval(108, 346, 8, 8);
        g.fillOval(145, 363, 8, 8);
        g.fillOval(182, 291, 8, 8);
        g.fillOval(222, 276, 8, 8);
        g.fillOval(171, 663, 8, 8);
        g.fillOval(139, 390, 8, 8);
        g.fillOval(193, 297, 8, 8);
        g.fillOval(193, 647, 8, 8);
        g.fillOval(297, 671, 8, 8);
        g.fillOval(296, 267, 8, 8);
        g.fillOval(422, 267, 8, 8);
        g.fillOval(422, 671, 8, 8);
        g.fillOval(546, 82, 8, 8);
        g.fillOval(546, 169, 8, 8);
        g.fillOval(546, 367, 8, 8);
        g.fillOval(548, 460, 8, 8);
        g.fillOval(546, 671, 8, 8);
        g.fillOval(669, 671, 8, 8);
        g.fillOval(669, 471, 8, 8);
        g.fillOval(669, 371, 8, 8);
        g.fillOval(669, 171, 8, 8);
        g.fillOval(669, 71, 8, 8);
        g.fillOval(793, 671, 8, 8);
        g.fillOval(793, 471, 8, 8);
        g.fillOval(793, 371, 8, 8);
        g.fillOval(793, 171, 8, 8);
        g.fillOval(793, 71, 8, 8);
        g.fillOval(918, 671, 8, 8);
        g.fillOval(918, 471, 8, 8);
        g.fillOval(918, 371, 8, 8);
        g.fillOval(918, 171, 8, 8);
        g.fillOval(1045, 671, 8, 8);
        g.fillOval(220, 681, 8, 8);
        g.fillOval(566, 646, 8, 8);
        g.fillOval(343,284, 8, 8);
        g.fillOval(208,293, 8, 8);
        g.fillOval(215,288, 8, 8);
        g.fillOval(219,283, 8, 8);
        g.fillOval(197,647, 8, 8);
        g.fillOval(202,648, 8, 8);
        g.fillOval(205,648, 8, 8);
        g.fillOval(209,652, 8, 8);


        g.fillOval(180, 250, 8, 8);
        g.fillOval(208, 692, 8, 8);
    }
}
