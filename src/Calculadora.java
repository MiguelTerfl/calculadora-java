

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {

    private JButton btnSuma, btnResta, btnMult, btnDiv,
            igual, limpiar, nueve, ocho, siete, seis, cinco, cuatro, tres,
            dos, uno, cero;
    private JTextField textInput;
    private int num1, resultado;
    private String operacion = "", cadenaNum = "";

    public Calculadora() {
        setTitle("Calculadora");
        setSize(390, 460);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textInput = new JTextField();
        textInput.setBounds(15, 10, 345, 50);
        textInput.setFont(new Font("Arial", Font.BOLD, 24)); // Fuente personalizada
        add(textInput);

        btnSuma = new JButton("+");
        btnSuma.setBounds(278, 70, 80, 80);
        add(btnSuma);
        btnSuma.addActionListener(this);

        btnResta = new JButton("-");
        btnResta.setBounds(278, 155, 80, 80);
        add(btnResta);
        btnResta.addActionListener(this);

        btnMult = new JButton("*");
        btnMult.setBounds(278, 240, 80, 80);
        add(btnMult);
        btnMult.addActionListener(this);

        btnDiv = new JButton("/");
        btnDiv.setBounds(278, 325, 80, 80);
        add(btnDiv);
        btnDiv.addActionListener(this);

        tres = new JButton("3");
        tres.setBounds(191, 70, 80, 80);
        add(tres);
        tres.addActionListener(this);

        seis = new JButton("6");
        seis.setBounds(191, 155, 80, 80);
        add(seis);
        seis.addActionListener(this);

        nueve = new JButton("9");
        nueve.setBounds(191, 240, 80, 80);
        add(nueve);
        nueve.addActionListener(this);

        igual = new JButton("=");
        igual.setBounds(191, 325, 80, 80);
        add(igual);
        igual.addActionListener(this);

        dos = new JButton("2");
        dos.setBounds(103, 70, 80, 80);
        add(dos);
        dos.addActionListener(this);

        cinco = new JButton("5");
        cinco.setBounds(103, 155, 80, 80);
        add(cinco);
        cinco.addActionListener(this);

        ocho = new JButton("8");
        ocho.setBounds(103, 240, 80, 80);
        add(ocho);
        ocho.addActionListener(this);

        cero = new JButton("0");
        cero.setBounds(103, 325, 80, 80);
        add(cero);
        cero.addActionListener(this);

        uno = new JButton("1");
        uno.setBounds(15, 70, 80, 80);
        add(uno);
        uno.addActionListener(this);

        cuatro = new JButton("4");
        cuatro.setBounds(15, 155, 80, 80);
        add(cuatro);
        cuatro.addActionListener(this);

        siete = new JButton("7");
        siete.setBounds(15, 240, 80, 80);
        add(siete);
        siete.addActionListener(this);

        limpiar = new JButton("C");
        limpiar.setBounds(15, 325, 80, 80);
        add(limpiar);
        limpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == uno) {
            cadenaNum += "1";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == dos) {
            cadenaNum += "2";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == tres) {
            cadenaNum += "3";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == cuatro) {
            cadenaNum += "4";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == cinco) {
            cadenaNum += "5";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == seis) {
            cadenaNum += "6";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == siete) {
            cadenaNum += "7";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == ocho) {
            cadenaNum += "8";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == nueve) {
            cadenaNum += "9";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == cero) {
            cadenaNum += "0";
            textInput.setText(cadenaNum);
        }
        if (e.getSource() == limpiar) {
            cadenaNum = "";
            textInput.setText("");
        }
        if (e.getSource() == btnSuma) {
            num1 = Integer.parseInt(cadenaNum);
            textInput.setText("+");
            cadenaNum = "";
            operacion = "sumar";
        }
        if (e.getSource() == btnResta) {
            num1 = Integer.parseInt(cadenaNum);
            textInput.setText("-");
            cadenaNum = "";
            operacion = "restar";
        }
        if (e.getSource() == btnMult) {
            num1 = Integer.parseInt(cadenaNum);
            textInput.setText("*");
            cadenaNum = "";
            operacion = "multiplicar";
        }
        if (e.getSource() == btnDiv) {
            num1 = Integer.parseInt(cadenaNum);
            textInput.setText("/");
            cadenaNum = "";
            operacion = "dividir";
        }
        if (e.getSource() == igual) {
            int num2 = Integer.parseInt(cadenaNum);
            switch (operacion) {
                case "sumar":
                    resultado = num1 + num2;
                    break;
                case "restar":
                    resultado = num1 - num2;
                    break;
                case "multiplicar":
                    resultado = num1 * num2;
                    break;
                case "dividir":
                    if (num2 == 0) {
                        textInput.setText("Error");
                        return;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
            }
            textInput.setText(String.valueOf(resultado));
            cadenaNum = ""; // Limpiar después de calcular
        }
    }
}
