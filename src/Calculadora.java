// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/**public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Olá cambada!");
        System.out.printf("Este é meu primeiro programa em Java!");
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        /*for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}**/
import javax.swing.*;
import java.awt.*;

public class Calculadora {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        JTextField textField = new JTextField(24);
        panel.add(textField);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setPreferredSize(new Dimension(60,60));
        JButton button9 = new JButton("9");
        button9.setPreferredSize(new Dimension(60,60));
        JButton button8 = new JButton("8");
        button8.setPreferredSize(new Dimension(60,60));
        JButton button7 = new JButton("7");
        button7.setPreferredSize(new Dimension(60,60));
        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setPreferredSize(new Dimension(60,60));
        JButton button6 = new JButton("6");
        button6.setPreferredSize(new Dimension(60,60));
        JButton button5 = new JButton("5");
        button5.setPreferredSize(new Dimension(60,60));
        JButton button4 = new JButton("4");
        button4.setPreferredSize(new Dimension(60,60));
        JButton buttonSub = new JButton("-");
        buttonSub.setPreferredSize(new Dimension(60,60));
        JButton button3 = new JButton("3");
        button3.setPreferredSize(new Dimension(60,60));
        JButton button2 = new JButton("2");
        button2.setPreferredSize(new Dimension(60,60));
        JButton button1 = new JButton("1");
        button1.setPreferredSize(new Dimension(60,60));
        JButton buttonSum = new JButton("+");
        buttonSum.setPreferredSize(new Dimension(60,60));
        JButton button0 = new JButton("0");
        button0.setPreferredSize(new Dimension(60,60));
        JButton buttonVirgula = new JButton(",");
        buttonVirgula.setPreferredSize(new Dimension(60,60));
        JButton buttonEqual = new JButton("=");
        buttonEqual.setPreferredSize(new Dimension(60,60));
        JButton buttonLimpar = new JButton("LIMPAR");
        buttonLimpar.setPreferredSize(new Dimension(256,60));
        // Adicione botões para os números e operadores aqui...

        panel.add(buttonDivide);
        panel.add(button9);
        panel.add(button8);
        panel.add(button7);
        panel.add(buttonMultiplication);
        panel.add(button6);
        panel.add(button5);
        panel.add(button4);
        panel.add(buttonSub);
        panel.add(button3);
        panel.add(button2);
        panel.add(button1);
        panel.add(buttonSum);
        panel.add(button0);
        panel.add(buttonVirgula);
        panel.add(buttonEqual);
        panel.add(buttonLimpar);
        // Adicione os outros botões...

        // Cor da calculadora e botões

        button0.addActionListener(e -> {
            textField.setText(textField.getText() + "0");
        });
        button1.addActionListener(e -> {
            textField.setText(textField.getText() + "1");
        });
        button2.addActionListener(e -> {
            textField.setText(textField.getText() + "2");
        });
        button3.addActionListener(e -> {
            textField.setText(textField.getText() + "3");
        });
        button4.addActionListener(e -> {
            textField.setText(textField.getText() + "4");
        });
        button5.addActionListener(e -> {
            textField.setText(textField.getText() + "5");
        });
        button6.addActionListener(e -> {
            textField.setText(textField.getText() + "6");
        });
        button7.addActionListener(e -> {
            textField.setText(textField.getText() + "7");
        });
        button8.addActionListener(e -> {
            textField.setText(textField.getText() + "8");
        });
        button9.addActionListener(e -> {
            textField.setText(textField.getText() + "9");
        });
        buttonSum.addActionListener(e -> {
            textField.setText(textField.getText() + "+");
        });
        buttonSub.addActionListener(e -> {
            textField.setText(textField.getText() + "-");
        });
        buttonDivide.addActionListener(e -> {
            textField.setText(textField.getText() + "/");
        });
        buttonMultiplication.addActionListener(e -> {
            textField.setText(textField.getText() + "*");
        });
        buttonEqual.addActionListener(e -> {
            String expressao = textField.getText();

            // Verifique se a expressão contém um operador
            if (expressao.contains("+")) {
                String[] partes = expressao.split("\\+");
                if (partes.length == 2) {
                    double num1 = Double.parseDouble(partes[0]);
                    double num2 = Double.parseDouble(partes[1]);
                    double resultado = num1 + num2;
                    textField.setText(String.valueOf(resultado));
                }
            } else if (expressao.contains("-")) {
                String[] partes = expressao.split("\\-");
                if (partes.length == 2) {
                    double num1 = Double.parseDouble(partes[0]);
                    double num2 = Double.parseDouble(partes[1]);
                    double resultado = num1 - num2;
                    textField.setText(String.valueOf(resultado));
                }
            } else if (expressao.contains("*")) {
                String[] partes = expressao.split("\\*");
                if (partes.length == 2) {
                    double num1 = Double.parseDouble(partes[0]);
                    double num2 = Double.parseDouble(partes[1]);
                    double resultado = num1 * num2;
                    textField.setText(String.valueOf(resultado));
                }
            } else if (expressao.contains("/")) {
                String[] partes = expressao.split("\\/");
                if (partes.length == 2) {
                    double num1 = Double.parseDouble(partes[0]);
                    double num2 = Double.parseDouble(partes[1]);
                    double resultado = num1 / num2;
                    textField.setText(String.valueOf(resultado));
                }
            }
        });
        buttonLimpar.addActionListener(e -> {
            textField.setText("");
        });
        frame.setVisible(true);
    }
}
