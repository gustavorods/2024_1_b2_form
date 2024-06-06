import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main extends JFrame {
    // Objetos
    JLabel nomeLabel, nomeLabelPlaceHolder, idadeLabel, sexoLabel, rdnButton1Label, rdnButton2Label, interessesLabel, chkBox1Label, chkBox2Label, chkBox3Label,  estdCivilLabel, creditos;
    JButton enviar, limpar;
    JTextField nomeField, idadeField;

    JRadioButton mascRdnButton, femiRdnButton;
    ButtonGroup grupoRdnButton = new ButtonGroup();

    JCheckBox interesse1ChkButton, interesse2ChkButton, interesse3ChkButton;

    JComboBox<String> estdCivil;
    String estdCivilArray[] = {"Solteiro(a)", "Casado(a)", "viúvo(a)", "Divorciado(a)"};

    public Main() {
        // Configurações da Janela
            super("Formulário");
            Container tela = getContentPane();
            setLayout(null);
            setSize(500,500);
            setResizable(false);

        // Criando os elementos
            // Label
            nomeLabel = new JLabel("Nome:");
            nomeLabelPlaceHolder = new JLabel("Insira aqui seu nome");
            nomeLabelPlaceHolder.setForeground(Color.gray);
            idadeLabel = new JLabel("Idade:");
            sexoLabel =  new JLabel("Sexo:");
            rdnButton1Label = new JLabel("Masculino");
            rdnButton2Label = new JLabel("Feminino");
            interessesLabel = new JLabel("Interesses:");
            chkBox1Label = new JLabel("Automóveis");
            chkBox2Label = new JLabel("Barcos");
            chkBox3Label = new JLabel("Automóveis");
            estdCivilLabel = new JLabel("Estado Civíl: ");
            creditos = new JLabel("Gustavo Rodrigues - 2° AMS - Tarde");

            // JButton
            enviar = new JButton("Enviar os dados");
            limpar = new JButton("Limpar os dados");

            // JTextFild
            nomeField = new JTextField();
            idadeField = new JTextField();

            // Radio button
            mascRdnButton = new JRadioButton("Masculino");
            femiRdnButton = new JRadioButton("Feminino");
            grupoRdnButton.add(mascRdnButton);
            grupoRdnButton.add(femiRdnButton);

            // Check Box
            interesse1ChkButton = new JCheckBox("Automóveis");
            interesse2ChkButton = new JCheckBox("Barcos");
            interesse3ChkButton = new JCheckBox("Aviões");

            // JCombo Box
            estdCivil = new JComboBox<>(estdCivilArray);

        // Posicionando na tela
            nomeLabel.setBounds(20,20,60,20);
            nomeLabelPlaceHolder.setBounds(75,20,140,20);
            nomeField.setBounds(70,20,140,25);

            idadeLabel.setBounds(20,60,60,20);
            idadeField.setBounds(70,60,100,20);

            sexoLabel.setBounds(20,105,60,20);
            mascRdnButton.setBounds(70, 106, 20, 20);
            rdnButton1Label.setBounds(95,105,60,20);
            femiRdnButton.setBounds(170, 106, 20, 20);
            rdnButton2Label.setBounds(195,105,60,20);

            interessesLabel.setBounds(20,145,100,20);
            interesse1ChkButton.setBounds(20, 170, 20, 20);
            chkBox1Label.setBounds(45, 170, 100, 20);
            interesse2ChkButton.setBounds(20, 190, 20, 20);
            chkBox2Label.setBounds(45, 190, 100, 20);
            interesse3ChkButton.setBounds(20, 210, 20, 20);
            chkBox3Label.setBounds(45, 210, 100, 20);

            estdCivilLabel.setBounds(20,250,100,20);
            estdCivil.setBounds(105,250,100,20);

            enviar.setBounds(20,300,130,20);
            limpar.setBounds(165,300,130,20);

            creditos.setBounds(20,400,250,20);

        // Métodos / Funções
            // Apaga os dados
            limpar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                            nomeField.setText("");
                            idadeField.setText("");
                            grupoRdnButton.clearSelection();
                            interesse1ChkButton.setSelected(false);
                            interesse2ChkButton.setSelected(false);
                            interesse3ChkButton.setSelected(false);
                            estdCivil.setSelectedIndex(0);
                    }
            });

            // Dicas
            enviar.setMnemonic(KeyEvent.VK_E);
            limpar.setMnemonic(KeyEvent.VK_L);

            // Place Holder

        // Adicionando da tela
            tela.add(nomeLabel);
            tela.add(nomeLabelPlaceHolder);
            tela.add(nomeField);
            tela.add(idadeLabel);
            tela.add(idadeField);
            tela.add(sexoLabel);
            tela.add(rdnButton1Label);
            tela.add(rdnButton2Label);
            tela.add(interessesLabel);
            tela.add(chkBox1Label);
            tela.add(chkBox2Label);
            tela.add(chkBox3Label);
            tela.add(estdCivilLabel);
            tela.add(creditos);
            tela.add(enviar);
            tela.add(limpar);
            tela.add(mascRdnButton);
            tela.add(femiRdnButton);
            tela.add(interesse1ChkButton);
            tela.add(interesse2ChkButton);
            tela.add(interesse3ChkButton);
            tela.add(estdCivil);

            setVisible(true);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
