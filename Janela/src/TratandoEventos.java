import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TratandoEventos {

    public static void main(String[] args) {
        //Criando variavel que será nossa janela principal
        JFrame janela = new JFrame("Tratando Eventos");
        //configurando sua posição inicial (x = 100, y = 50 e o tamanho da janela 400x300
        janela.setBounds(100,50, 400, 300);
        //configurando comportamento do botão fechar
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //Selecionar o objeto conteiner da nossa janela
        Container caixa = janela.getContentPane();


        //Definindo Layout da janela (como os elementos vão se comportar dentro do container caixa)
        //Os objetos se ajusta lado a lado, mudando de linha se não couberem no espaço disponivel
        FlowLayout flow = new FlowLayout();
        //GridLayout criamos uma tabela de x linhas e y colunas, cada celula desta tabela recebe um componente
        //GridLayout flow = new GridLayout(5, 1);
        //Divide a janela em 5 areas, topo, base, esquerda, centro e direita
        //BorderLayout flow = new BorderLayout();

        //atribiu o layout ao container
        caixa.setLayout(flow);

        //Cria o botão e adiciona a caixa
        JButton b1 = new JButton("Somar");
        caixa.add(b1);
        //Adicionando elemento com a posição do borderLayout
        //caixa.add(b1, BorderLayout.PAGE_START);
        JButton b2 = new JButton("Subtrair");
        caixa.add(b2);
        //Adicionando elemento com a posição do borderLayout
        //caixa.add(b2, BorderLayout.LINE_START);
        JButton b3 = new JButton("Multiplicar");
        caixa.add(b3);
        //Adicionando elemento com a posição do borderLayout
        //caixa.add(b3, BorderLayout.CENTER);
        JButton b4 = new JButton("Dividir");
        caixa.add(b4);
        //Adicionando elemento com a posição do borderLayout
        //caixa.add(b4, BorderLayout.LINE_END);
        JButton b5 = new JButton("Sair");
        caixa.add(b5);
        //Adicionando elemento com a posição do borderLayout
        //caixa.add(b5, BorderLayout.PAGE_END);

        //redimensiona a janela para caber todos os elementos
        //janela.pack();


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaSomar j1 = new JanelaSomar(janela,  "Somar");
                j1.mostrarJanela();
            }
        });
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaSubtrair j2 = new JanelaSubtrair(janela, "Subtrair");
                j2.mostrarJanela();
            }
        });
        
        b3.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		JanelaMultiplicar j3 = new JanelaMultiplicar(janela, "Multiplicar");
        		j3.mostrarJanela();
        	}
        });
        
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaDivisao j4 = new JanelaDivisao(janela, "Dividir");
                j4.mostrarJanela();
            }
        });

        //Adicionando um Listener ao Botão Sair (b5)
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão Sair pressionado");
                //Encerra a aplicação com status de OK
                System.exit(0);
            }
        });


        janela.setVisible(true);
    }
}