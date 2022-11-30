
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaMultiplicar extends  JDialog{

    JTextField jtfNum1, jtfNum2;
    JButton btnSomar, btnSair;

    public JanelaMultiplicar(Frame owner, String title) {
        super(owner, title);
        getContentPane().setBackground(Color.WHITE);
        setSize(250,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel l1 = new JLabel("Primeiro Numero: ");
        JLabel l2 = new JLabel("Segundo Numero: ");
        JLabel l3 = new JLabel("Multiplica��o: ");
        JLabel esp1 = new JLabel(" ");
        esp1.setPreferredSize(new Dimension(75,20));
        jtfNum1 = new JTextField(10);
        jtfNum2 = new JTextField(10);
        btnSomar = new JButton("Multiplica��o");
        btnSair = new JButton("Sair");

        FlowLayout flow = new FlowLayout(FlowLayout.LEFT);
        getContentPane().setLayout(flow);
        getContentPane().add(l1);
        getContentPane().add(jtfNum1);
        getContentPane().add(l2);
        getContentPane().add(jtfNum2);
        getContentPane().add(btnSomar);
        getContentPane().add(btnSair);
        getContentPane().add(esp1);
        getContentPane().add(l3);

        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sair();
            }
        });

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String num1 = jtfNum1.getText();
                    num1 = num1.replace(',','.');
                    if (num1.equals("")){
                        throw new Exception("Campo Primeiro Numero Vazio");
                    }
                    String num2 = jtfNum2.getText().replace(',','.');
                    if (num2.equals("")){
                        throw new Exception("Campo Segundo Numero Vazio");
                    }
                    double n1 = Double.parseDouble(num1);
                    double n2 = Double.parseDouble(num2);
                    double resultado = multiplicar(n1, n2);
                    l3.setText("Multiplica��o: " + resultado);
                } catch (NumberFormatException erro){
                    l3.setText("Numero inv�lido");
                } catch (Exception erro){
                    l3.setText(erro.getMessage());
                }
            }
        });
    }

    public double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    public void sair(){
        dispose();
    }

    public void mostrarJanela(){
        setVisible(true);
    }
}

